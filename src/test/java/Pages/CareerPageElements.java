package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareerPageElements {


    WebDriver driver;
    public CareerPageElements(WebDriver driver)
    {
        this.driver=driver;
    }


    @FindBy(how = How.LINK_TEXT,using = "South Africa")
    WebElement CountryLink;
    @FindBy(how = How.LINK_TEXT,using = "Senior Test Automation Specialist – Johannesburg") WebElement FirstPosition;



    public void ClickCountry()
    {

        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(CountryLink)).click();
    }


    public void ClickFirstPosition()
    {

        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(FirstPosition)).click();
    }

}
