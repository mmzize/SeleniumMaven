package TestsClases;

import Helper.BrowserSetup;
import Helper.GenerateRandomNumber;
import Pages.ApplyPageElements;
import Pages.CareerPageElements;
import Pages.HomePageElements;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;


public class ApplyforJobTests   extends GenerateRandomNumber {

    public static String dir = System.getProperty("user.dir");

    public static final String excel = dir+"/TestData/DataSheet.xlsx";
    String phoneNumber=randomNumb();


    WebDriver driver = BrowserSetup.startBrowser("chrome","https://www.ilabquality.com/");

    HomePageElements homeP = PageFactory.initElements(driver, HomePageElements.class);

    CareerPageElements careerP =PageFactory.initElements(driver, CareerPageElements.class);

    ApplyPageElements ApplyP =PageFactory.initElements(driver, ApplyPageElements.class);

    public ApplyforJobTests() throws IOException {
    }



    @Test(priority = 1,description = "clicking career link on home")
    public void ClickCareer() throws IOException {

        homeP.ClickCareerLink();
        careerP.ClickCountry();
        careerP.ClickFirstPosition();
        ApplyP.ClickApplyOnlineLink();

    }

    @Test(priority = 2,description = "in this test method i am clicking the career link")
    public void SelectCountryAndClickFirstPosition()
    {
        careerP.ClickCountry();
        careerP.ClickFirstPosition();
        ApplyP.ClickApplyOnlineLink();
    }

    @Test(priority = 3,description = " firstly read from excel then input details on textbox and click apply")
    public void InputDetailsAndClickAplyButton() throws IOException {
        // read through the object and look through that
        FileInputStream fis = new FileInputStream(excel);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        String name = sheet.getRow(1).getCell(0).getStringCellValue();
        String email = sheet.getRow(1).getCell(1).getStringCellValue();
        String whywork = sheet.getRow(1).getCell(3).getStringCellValue();

        ApplyP.EnterName(name);
        ApplyP.EnterEmailAdress(email);
        ApplyP.EnterPhoneNumber(phoneNumber);
        ApplyP.WriteWhyWorkforIlab(whywork);
        ApplyP.ClickSendApplicationButton();
        ApplyP. ValidateErrorLabel();
    }



//this method will execute after the tests have completed(closing the browser)

    @AfterClass

    public void closeBrowser()

    {
        driver.quit();
    }



}
