package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.LeftNav;

public class CountrySteps {

    private final LeftNav leftNav;
    private final DialogContent dialogContent;

    public CountrySteps(LeftNav leftNav, DialogContent dialogContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
    }

    @And("^Navigate to country page$")
    public void navigateToCountryPage() {
        leftNav.clickFunction(leftNav.getSetupOne());
        leftNav.clickFunction(leftNav.getParameters());
        leftNav.clickFunction(leftNav.getCountry());
    }

    @When("^Create a country$")
    public void createACountry() {

        leftNav.clickFunction(dialogContent.getAddBtn());
        leftNav.sendKeysFunction(dialogContent.getInputName(), "Dortmund Merkez1");
        leftNav.sendKeysFunction(dialogContent.getInputCode(), "44369");
        leftNav.clickFunction(dialogContent.getSaveBtn());
    }

    @Then("^Success massage should be displayed$")
    public void successMassageShouldBeDisplayed() {
        leftNav.verifyElementContainsText(dialogContent.getSuccessMessage(), "successfully");
    }
}
