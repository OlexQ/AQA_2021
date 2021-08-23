package singletonConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Singleton {
    public static WebDriver driver = null;


    public static void initialize(String browserName){
        //Use Of Singleton Concept and Initialize webDriver

        if (driver == null) {
            if (browserName.equalsIgnoreCase(BrowserName.CHROME)) {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase(BrowserName.FIREFOX)){
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
            }
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

    }
/*    public void close(){
        System.out.println("closing the browser");
        driver.close();
        driver = null;
    }*/

    public static void quit(){
        System.out.println("quiting the browser");
        driver.quit();
        driver = null;
    }
}
