package demo.steps_definition;

import demo.pages.bukalapak.BukalapakPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginStepDef {
    BukalapakPage bukalapakPage = new BukalapakPage();

    @When("User click button Login")
    public void userClickButtonLogin() {
        bukalapakPage.clicktoLoginPage();
    }

    @And("User input email {string} on Login page")
    public void userInputEmailOnLoginPage(String email) {
        bukalapakPage.inputEmailLogin(email);
    }

    @And("User input {string} on login password field")
    public void userInputOnLoginPasswordField(String password) {
        bukalapakPage.inputPasswordLogin(password);
    }

    @And("User click Login Button")
    public void userClickLoginButton() {
        bukalapakPage.clickLoginButton();
    }
}
