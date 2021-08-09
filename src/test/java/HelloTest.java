import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import singletonConfig.Singleton;

class HelloTest {

    @BeforeClass
    public void setUp() {
        Singleton.initialize();
    }

    @Test
    public void verifySearchPresence() {
        Assert.assertEquals(Singleton.driver.findElement(By.xpath("//input[@id='orb-search-q']")).isDisplayed(), true);
    }

    @Test
    public void verifySearchResult() {
        WebElement searchInput = Singleton.driver.findElement(By.xpath("//input[@id='orb-search-q']"));
        searchInput.sendKeys("Testy", Keys.ENTER);
 //       Assert.assertEquals();

    }


    @AfterClass
    public void tearDown() {
        Singleton.quit();
    }


}