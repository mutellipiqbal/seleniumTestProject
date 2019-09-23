package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.EmailPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ContactsPageTest extends TestBase {

    ContactsPage contactsPage;

    LoginPage loginPage;
    HomePage homePage;
    public ContactsPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        inialization();
        loginPage = new LoginPage();
        homePage =loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
        homePage.contact();
        contactsPage= new ContactsPage();

    }


    @Test(priority=1)
    public void verifyCheckbox(){
    contactsPage.clicknewButton();
    }

    @DataProvider
    public Object[][] getTestData(){
        Object data[][] = TestUtil.getTestData("Sheet1");
        return data;
    }

    @Test(priority=2, dataProvider = "getTestData")
    public void saveInfo(String firstName, String lastName, String EMAIL){
        contactsPage.clicknewButton();
        contactsPage.fillInfo(firstName,lastName, EMAIL);
        contactsPage.saveButton();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
