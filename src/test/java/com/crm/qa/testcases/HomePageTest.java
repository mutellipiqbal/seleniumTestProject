package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    ContactsPage contactsPage;
    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        inialization();
        loginPage = new LoginPage();
        contactsPage= new ContactsPage();
        homePage =loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
    }



    @Test
    public void verifyHomePageTitle(){
       String homePageTitle= homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle,"CRM");
    }

    @Test
    public void ContactsPageVerify(){
        contactsPage= homePage.contact();
    }

    @Test
    public void logoVerify(){
        boolean b=homePage.logoCheck();
        Assert.assertTrue(b);
    }




    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
