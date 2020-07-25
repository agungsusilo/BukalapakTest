package demo.pages.logintestapp;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

public class LogintestApp {

  public boolean isOnLoginPage() {
    AndroidElement loginIcon = AndroidDriverInstance.androidDriver
        .findElement(MobileBy.xpath("//android.widget.ImageView"));
    return loginIcon.isDisplayed();
  }

  public void clickRegisterfromLogin() {
    AndroidElement regisbutton = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("textViewLinkRegister"));
    regisbutton.click();
  }


  public void inputName(String name) {
    AndroidElement namefield = AndroidDriverInstance.androidDriver
        .findElement(MobileBy.id("textInputEditTextName"));
    namefield.sendKeys(name);
  }

  public void inputEmail(String email) {
    AndroidElement emailfield = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("textInputEditTextEmail"));
    emailfield.sendKeys(email);
  }

  public void inputPass(String password) {
    AndroidElement passfield = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("textInputEditTextPassword"));
    passfield.sendKeys(password);
  }

  public void inputConfirmation(String confirmation) {
    AndroidElement confirmfield = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("textInputEditTextConfirmPassword"));
    confirmfield.sendKeys(confirmation);
  }

  public void clickSubmit() {
    AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
        .findElement(MobileBy.id("appCompatButtonRegister"));
    buttonSubmit.click();
  }

  public boolean seeSuccessMsg() {
    AndroidElement msgsuccess = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("snackbar_text"));
    return msgsuccess.isDisplayed();
  }

  public void inputLoginEmail(String email) {
    AndroidElement emailfield = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("textInputEditTextEmail"));
    emailfield.sendKeys(email);
  }

  public void inputLoginPass(String pass) {
    AndroidElement passfield = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("textInputEditTextPassword"));
    passfield.sendKeys(pass);
  }

  public void clickLogin() {
    AndroidElement loginButton = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("appCompatButtonLogin"));
    loginButton.click();
  }

  public boolean seeNameError() {
    AndroidElement errorMsg = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.xpath("//*[contains(@text, 'Enter Full Name')]"));
    return errorMsg.isDisplayed();
  }

  public void clickLoginLink() {
    AndroidElement loginButton = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("appCompatTextViewLoginLink"));
    loginButton.click();
  }

  public boolean seeHomePage() {
    AndroidElement homepage = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("recyclerViewUsers"));
    return homepage.isDisplayed();
  }

  public boolean seeLoginMsg() {
    AndroidElement loginerror = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("snackbar_text"));
    return loginerror.isDisplayed();
  }

  public void clickLoginBTN() {
    AndroidElement loginButton = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("appCompatButtonLogin"));
    loginButton.click();
  }


}
