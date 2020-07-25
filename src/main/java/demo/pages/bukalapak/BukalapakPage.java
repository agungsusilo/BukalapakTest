package demo.pages.bukalapak;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BukalapakPage {

  public void openPage() {
    WebdriverInstance.webdriver.get("https://www.bukalapak.com");
  }

  public void clickRegister() {
    WebElement registerButton = WebdriverInstance.webdriver
            .findElement(By.xpath("//p[contains(text(),'Daftar')]"));
    registerButton.click();
  }

  public void inputName(String name){
    WebElement namefield = WebdriverInstance.webdriver
            .findElement(By.id("user_name"));
    namefield.sendKeys(name);
  }

  public void inputEmail(String email){
    WebElement namefield = WebdriverInstance.webdriver
            .findElement(By.id("email_or_phone"));
    namefield.sendKeys(email);
  }


  public void clickGender(){
    WebElement malegender = WebdriverInstance.webdriver
            .findElement(By.xpath("//span[contains(text(),'Laki-laki')]"));
    malegender.click();
  }

  public void inputUsername(String uname){
    WebElement unamefield = WebdriverInstance.webdriver
            .findElement(By.id("user_username"));
    unamefield.sendKeys(uname);
  }

  public void inputPassword(String password){
    WebElement passfield = WebdriverInstance.webdriver
            .findElement(By.id("user_password"));
    passfield.sendKeys(password);
  }

  public void inputConfirmationPassword(String password){
    WebElement passconfirm = WebdriverInstance.webdriver
            .findElement(By.id("user_password_confirmation"));
    passconfirm.sendKeys(password);
  }

  public void clickTC(){
    WebElement namefield = WebdriverInstance.webdriver
            .findElement(By.id("user_agreement"));
    namefield.click();
  }

  public void clickDaftar(){
    WebElement namefield = WebdriverInstance.webdriver
            .findElement(By.xpath("//button[contains(@name,'commit')]"));
    namefield.click();
  }

  public boolean isOnHomePage(){
    WebElement homepage = WebdriverInstance.webdriver
            .findElement(By.id("homepage-home-atf"));
    return homepage.isDisplayed();
  }


  //Login
  public void clicktoLoginPage() {
    WebElement loginbutton = WebdriverInstance.webdriver
            .findElement(By.xpath("//p[contains(text(),'Login')]"));
    loginbutton.click();
  }

  public void inputEmailLogin(String email){
    WebElement emailfield = WebdriverInstance.webdriver
            .findElement(By.id("user_session_username"));
    emailfield.sendKeys(email);
  }

  public void inputPasswordLogin(String password){
    WebElement passfield = WebdriverInstance.webdriver
            .findElement(By.id("user_session_password"));
    passfield.sendKeys(password);
  }

  public void clickLoginButton(){
    WebElement loginbtn = WebdriverInstance.webdriver
            .findElement(By.id("user_session_username"));
    loginbtn.click();
  }

  public void searchProduct(String keyword) {
    WebElement inputSearch = WebdriverInstance.webdriver
            .findElement(By.id("v-omnisearch__input"));
    inputSearch.sendKeys(keyword + Keys.ENTER);
  }

  public boolean isOnSearchResult(){
    WebElement searchresult = WebdriverInstance.webdriver
            .findElement(By.xpath("//p[@class='bl-text bl-text--subheading-3']"));
    return searchresult.isDisplayed();
  }


  public void clickFirstResult(){
    WebElement firstresult = WebdriverInstance.webdriver
            .findElement(By.xpath("//div[@class='bl-flex-container flex-wrap is-gutter-16']//div[1]//div[1]//div[1]//div[1]//figure[1]//div[1]//div[1]//a[1]//img[1]"));
    firstresult.click();
  }

  public void clickAddCart(){
    WebElement cartbutton = WebdriverInstance.webdriver
            .findElement(By.xpath("//button[@class='c-main-product__action__cart bl-button bl-button--outline bl-button--medium']"));
    cartbutton.click();
  }

  public boolean isProductAdded(){
    WebDriverWait wait = new WebDriverWait(WebdriverInstance.webdriver, 10);
    return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='c-notification--flash c-notification c-notification--medium c-notification--success']"))).isDisplayed();
  }

}
