package demo.steps_definition;

import demo.pages.logintestapp.LogintestApp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AndroidLogin {
    LogintestApp logintestApp = new LogintestApp();

    @And("User click login link")
    public void userClickLoginLink() {
        logintestApp.clickLoginLink();
    }

    @And("User input email {string} on login email field")
    public void userInputEmailOnLoginEmailField(String email) {
        logintestApp.inputLoginEmail(email);
    }

    @And("User input password {string} on login password field")
    public void userInputPasswordOnLoginPasswordField(String pass) {
        logintestApp.inputLoginPass(pass);
    }

    @Then("User see homepage")
    public void userSeeHomepage() {
        boolean actual = logintestApp.seeHomePage();
        Assert.assertTrue(actual);
    }

    @And("User click LOGIN button")
    public void userClickLOGINButton() {
        logintestApp.clickLoginBTN();
    }

    @Then("User see login error message")
    public void userSeeLoginErrorMessage() {
        boolean actual = logintestApp.seeLoginMsg();
        Assert.assertTrue(actual);
    }
}
