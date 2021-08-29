package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.BaseWebDriver;


public class DialogContent extends Parent {

    public DialogContent() {

        PageFactory.initElements(BaseWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath ="//ms-save-button//button")
    private WebElement saveBtn;

    @FindBy(xpath = "//hot-toast-container//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath ="//ms-delete-button//button")
    private WebElement deleteBtn;

    @FindBy(xpath = "//div[contains(text(),'because')]")
    private WebElement errorMessage;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchBtn;

    @FindBy(id= "ms-text-field-0")
    private WebElement name;

    @FindBy(id= "ms-text-field-1")
    private WebElement code;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addBtn;

    @FindBy(xpath = "(//div[@class='ps__rail-y'])[2]")
    private WebElement rightScroll;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editBtn;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialog;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExists;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement inputName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement inputCode;

    @FindBy(css = "button[aria-label='Close dialog']")
    private WebElement closeDialog;

    public WebElement getAddBtn() {
        return addBtn;
    }

    public WebElement getDashboard() {
        return dashboard;
    }

    public WebElement getSaveBtn() {
        return saveBtn;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getDeleteBtn() {
        return deleteBtn;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getInputName() {
        return inputName;
    }

    public WebElement getInputCode() {
        return inputCode;
    }

    public WebElement getRightScroll() {
        return rightScroll;
    }

    public WebElement getEditBtn() {
        return editBtn;
    }

    public WebElement getDeleteDialog() {
        return deleteDialog;
    }

    public WebElement getAcceptCookies() {
        return acceptCookies;
    }

    public WebElement getAlreadyExists() {
        return alreadyExists;
    }

    public WebElement getName() {
        return name;
    }

    public WebElement getCode() {
        return code;
    }

    public WebElement getCloseDialog() {
        return closeDialog;
    }
}
