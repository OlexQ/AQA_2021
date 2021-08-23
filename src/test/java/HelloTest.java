import locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import singletonConfig.Singleton;

import java.time.Duration;

public class HelloTest {

    public static final String url = "https://www.bbc.com/";

    @BeforeClass
    public void setUp() {
        Singleton.initialize("chrome");
        Singleton.driver.get(url);
    }

    @Test
    public void verifySearchPresence() {

        Assert.assertEquals(Singleton.driver.findElement(By.xpath(Locators.searchInput)).isDisplayed(), true);
    }

    @Test
    public void verifySearchResult() {
        WebElement searchInput = Singleton.driver.findElement(By.xpath(Locators.searchInput));
        searchInput.sendKeys("Testy", Keys.ENTER);
 //       Assert.assertEquals();

    }

    @Test
    public void verifyRadioRelaxPlaying() {
        WebElement moreButton = Singleton.driver.findElement(By.xpath(Locators.moreButton));
        moreButton.click();
        WebElement soundsMenuItem = Singleton.driver.findElement(By.xpath(Locators.soundsMenuItem));
        soundsMenuItem.click();

        WebElement thirdRadio = Singleton.driver.findElement(By.xpath(Locators.thirdRadio));
        thirdRadio.click();

        Singleton.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        String radioRelaxURL = Singleton.driver.getCurrentUrl();
        Assert.assertEquals(radioRelaxURL, "https://www.bbc.co.uk/sounds/play/live:bbc_radio_one_relax" );
    }

    @Test
    public void verifyMostPopular() {
        WebElement workLifeButton = Singleton.driver.findElement(By.xpath(Locators.workLifeButton));
        workLifeButton.click();
        WebElement mostPopularBlock = Singleton.driver.findElement(By.xpath(Locators.mostPopularBlock));

        // Scrolling down the page till the element is found
        Actions actions = new Actions(Singleton.driver);
        actions.moveToElement(mostPopularBlock);

        WebElement ninthArticle = Singleton.driver.findElement(By.xpath(Locators.ninthArticle));
        ninthArticle.click();
        WebElement firstSimilarArticle = Singleton.driver.findElement(By.xpath(Locators.firstSimilarArticle));
        firstSimilarArticle.click();

        String firstSimilarArticleURL = Singleton.driver.getCurrentUrl();
        Assert.assertEquals(firstSimilarArticleURL, "https://www.bbc.com/worklife/article/20210121-the-coronasomnia-phenomenon-keeping-us-from-getting-sleep" );
    }


    @AfterClass
    public void tearDown() {
        Singleton.quit();
    }


}