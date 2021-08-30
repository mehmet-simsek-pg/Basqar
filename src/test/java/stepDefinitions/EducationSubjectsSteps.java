package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.LeftNav;


public class EducationSubjectsSteps {

    private final LeftNav leftNav;
    private final DialogContent dialogContent;

    public EducationSubjectsSteps(LeftNav leftNav, DialogContent dialogContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
    }

    @And("^Navigate to education page$")
    public void navigateToEducationPage() {
        leftNav.clickFunction(leftNav.getEducation());
        leftNav.clickFunction(leftNav.getEducationSetup());
        leftNav.clickFunction(leftNav.getSubjectCategories());
    }

    @When("^Create a subject name as \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void createASubjectNameAsCodeAs(String subjectsName, String subjectCode) {
        leftNav.clickFunction(dialogContent.getAddBtn());
        leftNav.sendKeysFunction(dialogContent.getInputName(), subjectsName);
        leftNav.sendKeysFunction(dialogContent.getInputCode(), subjectCode);
        leftNav.clickFunction(dialogContent.getSaveBtn());
    }
}
