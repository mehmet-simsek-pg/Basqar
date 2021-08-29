package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.LeftNav;

public class SubjectCategorySteps {

    private final LeftNav leftNav;
    private final DialogContent dialogContent;

    public SubjectCategorySteps(LeftNav leftNav, DialogContent dialogContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
    }

    @Then("^Navigate to subject category page$")
    public void navigate_to_subject_category_page()  {
        leftNav.clickFunction(leftNav.getEducation());
        leftNav.clickFunction(leftNav.getEducationSetup());
        leftNav.clickFunction(leftNav.getSubjectCategories());
    }

    @When("^Create a Subject Categories name as \"([^\"]*)\" Subject Categories code\"([^\"]*)\"$")
    public void create_a_Subject_Categories_name_as_Subject_Categories_code(String name, String code)  {
        leftNav.clickFunction(dialogContent.getAddBtn());
        leftNav.sendKeysFunction(dialogContent.getInputName(), name);
        leftNav.sendKeysFunction(dialogContent.getInputCode(), code);
        leftNav.clickFunction(dialogContent.getSaveBtn());
    }

}
