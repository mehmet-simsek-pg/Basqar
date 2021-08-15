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
}
