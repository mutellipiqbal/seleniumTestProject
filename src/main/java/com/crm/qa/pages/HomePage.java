package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {


    @FindBy(xpath = "//*[@id=\'top-header-menu\']/div[1]")
    WebElement logo;

    @FindBy(xpath = "//span[contains(text(), 'Contacts')]")
    WebElement contacts;

    @FindBy(xpath = "//span[contains(text(), 'Email')]")
    WebElement email;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public boolean logoCheck(){
        return logo.isDisplayed();
    }
    public String verifyHomePageTitle(){
        return driver.getTitle();
    }

    public ContactsPage contact(){
        contacts.click();
        return new ContactsPage();
    }

    public EmailPage email(){
        email.click();
        return new EmailPage();
    }

}
