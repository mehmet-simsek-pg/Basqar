package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.BaseWebDriver;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(BaseWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement country;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath="//span[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(xpath="//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath="(//span[text()='Setup'])[5]")
    private WebElement educationSetup;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResource;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupThree;

    @FindBy(xpath = "//span[text()='Position Salary']")
    private WebElement positionSalary;

    public WebElement getSetupOne() {
        return setupOne;
    }

    public WebElement getParameters() {
        return parameters;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getCitizenShip() {
        return citizenShip;
    }

    public WebElement getSubjectCategories() {
        return subjectCategories;
    }

    public WebElement getEducation() {
        return education;
    }

    public WebElement getEducationSetup() {
        return educationSetup;
    }

    public WebElement getHumanResource() {
        return humanResource;
    }

    public WebElement getSetupThree() {
        return setupThree;
    }

    public WebElement getPositionSalary() {
        return positionSalary;
    }
}
