package com.tricentis.demowebshop.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends com.tricentis.demowebshop.utility.Utility {

    private static final Logger log = Logger.getLogger(RegisterPage.class);

    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;


    @FindBy(id = "register-button")
    WebElement registerTab;


    @FindBy(xpath = "//span[@for='FirstName']")
    WebElement firstNameRequired;



    @FindBy(xpath = "//span[@for='LastName']")
    WebElement lastNameRequired;



    @FindBy(xpath = "//span[@for='Email']")
    WebElement emailRequired;



    @FindBy(xpath = "//span[@for='Password']")
    WebElement passwordRequires;


    @FindBy(xpath = "//span[@for='ConfirmPassword']")
    WebElement passwordRequires2;



    @FindBy(xpath = "//input[@value='F']")
    WebElement selectGender;


    @FindBy(id = "FirstName")
    WebElement enterFirstName;



    @FindBy(id  = "LastName")
    WebElement enterLastName;




    @FindBy(id = "Email")
    WebElement enterEmail;


    @FindBy(id = "Password")
    WebElement enterPassword;


    @FindBy(id  = "ConfirmPassword")
    WebElement enterConfirmPassword;







    public String getRegisterText() {
        String message =  getTextFromElement(registerText);
      log.info("get " + registerText.toString());
      return message;

    }
    public void clickOnRegisterButton(){
        clickOnElement(registerTab);


    }
    public String getFirstNameRequired() {
     return getTextFromElement(firstNameRequired);
//      Reporter.log("get " + firstNameRequired.toString());
//       return message;

    }

    public String getLastNameRequired() {
//        Reporter.log("get " + lastNameRequired.toString());
//        CustomListeners.test.log(Status.PASS, "get " + lastNameRequired.toString());
        return getTextFromElement(lastNameRequired);
    }

    public String getEmailRequired() {
//        Reporter.log("get " + emailRequired.toString());
//        CustomListeners.test.log(Status.PASS, "get " + emailRequired.toString());
        return getTextFromElement(emailRequired);
    }
    public String getPasswordRequires() {
//        Reporter.log("get " + passwordRequires.toString());
//        CustomListeners.test.log(Status.PASS, "get " + passwordRequires.toString());
        return getTextFromElement(passwordRequires);
    }

    public String getPasswordRequires2() {
//        Reporter.log("get " + passwordRequires2.toString());
//        CustomListeners.test.log(Status.PASS, "get " + passwordRequires2.toString());
        return getTextFromElement(passwordRequires2);
    }


    public void clickOnGender(){
        clickOnElement(selectGender);
//        CustomListeners.test.log(Status.PASS, "Click on Male");

    }


    public void enterFirstNameField(String name) {
        sendTextToElement(enterFirstName, name);
//       CustomListeners.test.log(Status.PASS, "Enter name " + name);
    }

    public void enterLastNameField(String last) {
        sendTextToElement(enterLastName, last);
//       CustomListeners.test.log(Status.PASS, "Enter last name " + last);
    }


    public void enterEmailField(String email) {
        sendTextToElement(enterEmail, email);
//       CustomListeners.test.log(Status.PASS, "Enter EmailId " + email);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(enterPassword, password);
//        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }


    public void enterConfirmPasswordField(String password) {
        sendTextToElement(enterConfirmPassword, password);
//       CustomListeners.test.log(Status.PASS, "Enter Password " + password);
}





}
