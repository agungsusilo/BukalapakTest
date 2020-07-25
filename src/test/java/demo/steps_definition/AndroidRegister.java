package demo.steps_definition;

import demo.pages.logintestapp.LogintestApp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AndroidRegister {
    LogintestApp logintestApp = new LogintestApp();

    @Given("User is on test app login page")
    public void userIsOnTestAppLoginPage() {
        boolean actual = logintestApp.isOnLoginPage();
        Assert.assertTrue(actual);
    }

    @When("User click register button from login")
    public void userClickRegisterButtonFromLogin() {
        logintestApp.clickRegisterfromLogin();
    }


    @And("User input name {string} on name field")
    public void userInputNameOnNameField(String name) {
        logintestApp.inputName(name);
    }

    @And("User input email {string} on email field")
    public void userInputEmailOnEmailField(String email) {
        logintestApp.inputEmail(email);
    }

    @And("User input password {string} on password field")
    public void userInputPasswordOnPasswordField(String pass) {
        logintestApp.inputPass(pass);
    }

    @And("User input password {string} on confirmation password field")
    public void userInputPasswordOnConfirmationPasswordField(String confirm) {
        logintestApp.inputConfirmation(confirm);
    }

    @Then("User see registration success message")
    public void userSeeRegistrationSuccessMessage() {
        boolean actual= logintestApp.seeSuccessMsg();
        Assert.assertTrue(actual);
    }


    @And("User click register button")
    public void userClickRegisterButton() {
        logintestApp.clickSubmit();
    }

    @Then("User see name field error message")
    public void userSeeNameFieldErrorMessage() {
        boolean actual = logintestApp.seeNameError();
        Assert.assertTrue(actual);
    }
}
