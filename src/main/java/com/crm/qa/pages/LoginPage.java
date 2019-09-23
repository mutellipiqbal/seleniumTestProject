package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    @FindBy(xpath = "//span[@class='icon icon-xs mdi-chart-bar']")

    WebElement loginlink;

    @FindBy(name="email")
    WebElement username;

    @FindBy(name="password")
    WebElement password;


    @FindBy(xpath = "//div[contains(text(),'Login')]")
    WebElement loginButton;


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public String validatePageTitle(){
        return driver.getTitle();
    }

    public HomePage logIn(String uname, String pword){
        loginlink.click();
        username.sendKeys(uname);
        password.sendKeys(pword);
        loginButton.click();
        return new HomePage();
    }
}
