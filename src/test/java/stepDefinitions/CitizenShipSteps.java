package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.LeftNav;

public class CitizenShipSteps {

    private final LeftNav leftNav;
    private final DialogContent dialogContent;

    public CitizenShipSteps(LeftNav leftNav, DialogContent dialogContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
    }

    @And("^Navigate to citizenship page$")
    public void navigateToCitizenshipPage() {
        leftNav.clickFunction(leftNav.getSetupOne());
        leftNav.clickFunction(leftNav.getParameters());
        leftNav.clickFunction(leftNav.getCitizenShip());
    }

    @When("^User a citizenship name as \"([^\"]*)\" shortname as \"([^\"]*)\"$")
    public void userACitizenshipNameAsShortnameAs(String citizenShipName, String shortName)  {
        dialogContent.clickFunction(dialogContent.getAddBtn());
        dialogContent.sendKeysFunction(dialogContent.getInputName(), citizenShipName);
        dialogContent.sendKeysFunction(dialogContent.getInputShortName(), shortName);
        dialogContent.clickFunction(dialogContent.getSaveBtn());
    }

    @Then("^Already exists message should be displayed$")
    public void alreadyExistsMessageShouldBeDisplayed() {
        dialogContent.verifyElementContainsText(dialogContent.getAlreadyExists(), "already exists");
    }

    @And("^Click on close button$")
    public void clickOnCloseButton() {
        dialogContent.clickFunction(dialogContent.getCloseDialog());
    }
}
