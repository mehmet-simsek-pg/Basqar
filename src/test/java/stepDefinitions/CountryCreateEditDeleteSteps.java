package stepDefinitions;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pages.DialogContent;
import pages.LeftNav;

public class CountryCreateEditDeleteSteps {
    private final LeftNav leftNav;
    private final DialogContent dialogContent;

    public CountryCreateEditDeleteSteps(LeftNav leftNav, DialogContent dialogContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
    }

    @When("^Create a country name as \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void createACountryNameAsCodeAs(String countryName, String countryCode)  {
        leftNav.clickFunction(dialogContent.getAddBtn());
        leftNav.sendKeysFunction(dialogContent.getInputName(), countryName);
        leftNav.sendKeysFunction(dialogContent.getInputCode(), countryCode);
        leftNav.clickFunction(dialogContent.getSaveBtn());
    }

    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditTheTo(String oldCountryName, String newCountryName)  {
        dialogContent.sendKeysFunction(dialogContent.getInputName(),oldCountryName);
        dialogContent.clickFunction(dialogContent.getSearchBtn());
        dialogContent.waitUntilListLessThan(By.xpath("//ms-edit-button//button"),2);
        dialogContent.clickFunction(dialogContent.getEditBtn());
        dialogContent.sendKeysFunction(dialogContent.getInputName(),newCountryName);
        dialogContent.clickFunction(dialogContent.getSaveBtn());
    }

    @When("^User delete the \"([^\"]*)\"$")
    public void userDeleteThe(String newCountryName) {
        dialogContent.scrollUpToElement(dialogContent.getRightScroll());
        dialogContent.sendKeysFunction(dialogContent.getInputName(), newCountryName);
        dialogContent.clickFunction(dialogContent.getSearchBtn());
        dialogContent.waitUntilListLessThan(By.xpath("//ms-delete-button//button"),2);
        dialogContent.clickFunction(dialogContent.getDeleteBtn());
        dialogContent.clickFunction(dialogContent.getDeleteDialog());
    }
}
