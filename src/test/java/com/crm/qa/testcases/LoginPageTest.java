package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest  extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        inialization();
        loginPage = new LoginPage();

    }

    @Test(priority = 0)
    public void loginPageTiteTest(){
        String title =loginPage.validatePageTitle();
        Assert.assertEquals(title,"Free CRM #1 cloud software for any business large or small");
    }

    @Test(priority = 1)
    public void loginTest(){
       homePage= loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
