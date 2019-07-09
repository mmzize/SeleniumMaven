package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ApplyPageElements {

    WebDriver driver;
    public ApplyPageElements(WebDriver driver)
    {
        this.driver=driver;
    }

// finding elements using Page Factory
    @FindBy(how = How.LINK_TEXT,using = "Apply Online")
    WebElement ApplyOnlineLink;

    @FindBy(how = How.ID,using ="applicant_name")
    WebElement NameField;

    @FindBy(how = How.ID,using ="email")
    WebElement EmailAdressField;

    @FindBy(how = How.ID,using ="phone")
    WebElement PhoneNumberField;

    @FindBy(how = How.ID,using ="message")
    WebElement WhyWorkforIlab;

    @FindBy(how = How.XPATH,using ="//*[@id=\"wpjb_submit\"]")
    WebElement SendApplicationButton;

    @FindBy(how = How.XPATH,using ="//*[@id=\"wpjb-apply-form\"]/fieldset[1]/div[5]/div/ul/li")
    WebElement ErrorLabel;

//Click appy online Link
    public void ClickApplyOnlineLink()
    {

        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(ApplyOnlineLink)).click();

    }
//input the email
    public void EnterName(String names)
    {

        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(NameField)).sendKeys(names);

    }
//input the email
    public void EnterEmailAdress(String email)
    {

        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(EmailAdressField)).sendKeys(email);

    }
    //phone number input
    public void EnterPhoneNumber(String number)
    {

        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(PhoneNumberField)).sendKeys(number);

    }
// input to the why you want to wwork for ilab text box
    public void WriteWhyWorkforIlab(String whyWork)
    {

        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(WhyWorkforIlab)).sendKeys(whyWork);

    }
// click send application button
    public void ClickSendApplicationButton()
    {

        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(SendApplicationButton)).click();

    }

    //Validating the error message is displayed
    public void ValidateErrorLabel()
    {

        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(ErrorLabel));

        Assert.assertEquals(ErrorLabel.getText(), "You need to upload at least one file.");

    }
}
