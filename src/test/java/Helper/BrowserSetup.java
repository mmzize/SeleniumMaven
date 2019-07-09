package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup {


    public static String dir = System.getProperty("user.dir");

    public static final String Chromedriver = dir+"/src/main/Drivers/chromedriver.exe";
    public static final String Firefox = dir+"/src/main/Drivers/geckodriver.exe";



    static WebDriver driver;

    public static WebDriver startBrowser(String browserchoice,String url)
    {

        if ("firefox".equals(browserchoice)) {
            System.setProperty("webdriver.gecko.driver", Firefox);
            driver = new FirefoxDriver();
        } else if ("chrome".equals(browserchoice)) {
            System.setProperty("webdriver.chrome.driver", Chromedriver);
            driver = new ChromeDriver();
        }

       // driver.manage().window().maximize();

        driver.get(url);
        return driver;


    }

}
