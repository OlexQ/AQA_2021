package singletonConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Singleton {
    public static WebDriver driver = null;


    public static void initialize() {
        //Use Of Singleton Concept and Initialize webDriver
        if (driver == null) {
            if (BrowserName.CHROME.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (BrowserName.FIREFOX.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "/geckodriver.exe");
                driver = new FirefoxDriver();
            }
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(BrowserName.url);
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
