package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.LeftNav;

public class PositionSalarySteps {

    private final LeftNav leftNav;
    private final DialogContent dialogContent;

    public PositionSalarySteps(LeftNav leftNav, DialogContent dialogContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
    }

    @Given("^Navigate to Position Salary$")
        public void navigateToPositionSalaryPage(){
        leftNav.clickFunction(leftNav.getHumanResource());
        leftNav.clickFunction(leftNav.getSetupThree());
        leftNav.clickFunction(leftNav.getPositionSalary());
        }


    @When("^Create a position salary name as \"([^\"]*)\" short name as \"([^\"]*)\"$")
    public void createAPositionSalaryNameAsShortNameAs(String name, String shortName) {
        dialogContent.clickFunction(dialogContent.getAddBtn());
        dialogContent.sendKeysFunction(dialogContent.getInputName(), name);
        dialogContent.sendKeysFunction(dialogContent.getInputShortName(), shortName);
        dialogContent.clickFunction(dialogContent.getSaveBtn());
    }
}

