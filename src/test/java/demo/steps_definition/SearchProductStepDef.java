package demo.steps_definition;

import demo.pages.bukalapak.BukalapakPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchProductStepDef {
    BukalapakPage bukalapakPage = new BukalapakPage();
    
    @When("User input {string} on search box + enter keys")
    public void userInputOnSearchBoxEnterKeys(String keyword) {
        bukalapakPage.searchProduct(keyword);
    }

    @Then("User see search result page")
    public void userSeeSearchResultPage() {
        boolean actual = bukalapakPage.isOnSearchResult();
        Assert.assertTrue(actual);
    }
}
