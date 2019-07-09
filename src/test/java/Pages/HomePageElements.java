package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageElements {

    WebDriver driver;

    public HomePageElements(WebDriver driver)
    {
        this.driver=driver;
    }



    @FindBy(how = How.XPATH,using = "//*[@id=\"menu-item-1373\"]/a[1]")
    WebElement CareerLink;



    public void ClickCareerLink()
    {
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(CareerLink)).click();


    }
}
