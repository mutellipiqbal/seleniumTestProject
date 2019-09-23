package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends TestBase {


    public ContactsPage(){
        PageFactory.initElements(driver,this);
    }


    @FindBy (xpath = "//a[@href='/contacts/new']")
   public WebElement clickNew;

    @FindBy(xpath = "//form//input[@name ='first_name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@name ='last_name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@name='value']")
    WebElement emailInfo;

    @FindBy(xpath = "//i[@class='save icon']")
    WebElement saveButton;

    public void clicknewButton(){
        clickNew.click();

    }

    public void fillInfo(String nm, String lastnm, String email){
        firstName.sendKeys(nm);
        lastName.sendKeys(lastnm);
        emailInfo.sendKeys(email);
    }

    public void saveButton(){
        saveButton.click();
    }

}
