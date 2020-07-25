package demo.steps_definition;

import demo.pages.bukalapak.BukalapakPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddtoCartStepDef {
    BukalapakPage bukalapakPage = new BukalapakPage();

    @And("User click first result")
    public void userClickFirstResult() {
        bukalapakPage.clickFirstResult();
    }

    @And("User click addtocart button")
    public void userClickAddtocartButton() {
        bukalapakPage.clickAddCart();
    }

    @Then("User see the product is added")
    public void userSeeTheProductIsAdded() {
        boolean actual = bukalapakPage.isProductAdded();
        Assert.assertTrue(actual);
    }
}
