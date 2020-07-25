package demo.steps_definition;

import demo.pages.bukalapak.BukalapakPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterStepDef {

    BukalapakPage bukalapakPage = new BukalapakPage();

    @Given("User is open bukalapak page")
    public void userIsOpenBukalapakPage() {
        bukalapakPage.openPage();
    }

    @When("User click button Register")
    public void userClickButtonRegister() {
        bukalapakPage.clickRegister();
    }

    @And("user input name {string} on name field")
    public void userInputNameOnNameField(String name) {
        bukalapakPage.inputName(name);
    }

    @And("User input email {string} on register page")
    public void userInputEmailOnAddToDoPage(String email) {
        bukalapakPage.inputEmail(email);
    }

    @And("User click male gender")
    public void userClickGender() {
        bukalapakPage.clickGender();
    }

    @And("User input {string} on usernamefield")
    public void userInputOnUsernamefield(String username) {
        bukalapakPage.inputUsername(username);
    }

    @And("User input {string} on password field")
    public void userInputOnPasswordField(String password) {
        bukalapakPage.inputPassword(password);
    }

    @And("User input {string} on confirmation password field")
    public void userInputOnConfirmationPasswordField(String confirmation) {
        bukalapakPage.inputConfirmationPassword(confirmation);
    }

    @And("User click on TC agreement")
    public void userClickOnTCAgreement() {
        bukalapakPage.clickTC();
    }

    @And("User click button daftar")
    public void userClickButtonDaftar() {
        bukalapakPage.clickDaftar();
    }

    @Then("User is on bukalapak homepage")
    public void userSeeBukalapakHomepage() {
        boolean actual = bukalapakPage.isOnHomePage();
        Assert.assertTrue(actual);
    }
}
