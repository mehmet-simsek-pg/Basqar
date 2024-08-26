package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.DialogContent;
import pages.LoginPage;
import utilies.BaseWebDriver;
import utilies.ExcelData;

import java.util.List;

public class LoginSteps {

    private final DialogContent dialogContent;
    private final LoginPage loginPage;
    List<List<String>> loginData= ExcelData.getList("src/test/java/resources/LoginData.xlsx","Login",4);

    public LoginSteps(DialogContent dialogContent,LoginPage loginPage) {
        this.loginPage=loginPage;
        this.dialogContent = dialogContent;
    }

    @Given("^Navigate to Basqar$")
    public void navigate_to_Basqar() {
        WebDriver driver = BaseWebDriver.getDriver();
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();
    }

    @Then("^Enter valid username and password$")
    public void enterValidUsernameAndPassword() {

        dialogContent.clickFunction(dialogContent.getAcceptCookies());
        loginPage.sendKeysFunction(loginPage.getUsername(), loginData.get(1).get(0));
        loginPage.sendKeysFunction(loginPage.getPassword(), loginData.get(1).get(1));
        loginPage.clickFunction(loginPage.getLoginBtn());
    }

    @Then("^Enter invalid username and password$")
    public void enterInvalidUsernameAndPassword() {
        loginPage.sendKeysFunction(loginPage.getUsername(), loginData.get(1).get(2));
        loginPage.sendKeysFunction(loginPage.getPassword(), loginData.get(1).get(3));
        loginPage.clickFunction(loginPage.getLoginBtn());
    }

    @Then("^Dashboard text should be displayed$")
    public void dashboardTextShouldBeDisplayed() {
        dialogContent.verifyElementContainsText(dialogContent.getDashboard(),"Dashboard");
    }

    @Then("^Invalid text should be displayed$")
    public void invalidTextShouldBeDisplayed() {
        dialogContent.verifyElementContainsText(loginPage.getLoginErrorMsg(),"Invalid");
    }
}
