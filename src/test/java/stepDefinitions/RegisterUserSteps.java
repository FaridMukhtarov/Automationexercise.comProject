package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.RegisterUserPage;
import utilitise.Driver;
import utilitise.ReusableMethods;

public class RegisterUserSteps {

    ReusableMethods reusableMethods = new ReusableMethods();
    RegisterUserPage registerUserPage = new RegisterUserPage();
    public WebDriver driver;


    @Given("Launch browser")
    public void launchBrowser() {
        driver = Driver.getDriver();
    }

    @And("Navigate to url")
    public void navigateToUrl() {
        driver.get(reusableMethods.url);
    }

    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        registerUserPage.homePage();
    }

    @And("Click on Signup Login button")
    public void clickOnSignupLoginButton() {
        registerUserPage.signUpAndLoginButtonClick();
    }

    @And("Verify New User Signup is visible")
    public void verifyNewUserSignupIsVisible() {
        registerUserPage.newUserTitleVisible();
    }

    @And("Enter name and email address")
    public void enterNameAndEmailAddress() {
       registerUserPage.setNameAndEmail("Farid", "iuyweuyri@gmail.com");
    }

    @And("Click Signup button")
    public void clickSignupButton() {
        registerUserPage.signupButtonClick();
    }

    @And("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        registerUserPage.accountInformationTextVisible();
    }

    @And("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        registerUserPage.setTitleSelect();
        registerUserPage.setPassword("ferid1234");
        registerUserPage.selectData("1","January","1995");
    }

    @And("Select checkbox Sign up for our newsletter")
    public void selectCheckboxSignUpForOurNewsletter() {
        registerUserPage.selectCheckBoxNewsletter();
    }

    @And("Select checkbox Receive special offers from our partners")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        registerUserPage.selectCheckPartners();
    }

    @And("First name, Last name, Company, Addresss, Country, State, City, Zipcode, Mobile Number")
    public void firstNameLastNameCompanyAddresssCountryStateCityZipcodeMobileNumber() {
        registerUserPage.personalInfoPartOne("ferid", "Mukhtarov", "Fard", "bulbul 41", "apartment 7");
        registerUserPage.personalInfoPartTow("Azerbaycan", "Abseron", "Baku", "az 1234", "57365876");
    }

    @And("Click 'Create Account button")
    public void clickCreateAccountButton() {
        registerUserPage.clickCreateButton();
    }

    @And("Verify that ACCOUNT CREATED is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        registerUserPage.accountCreatedTextIsVisibly();
    }

    @And("Click Continue button")
    public void clickContinueButton() {
        registerUserPage.continueButton();
    }

    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        registerUserPage.userNameVisible();
    }

    @When("Click Delete Account button")
    public void clickDeleteAccountButton() {
        registerUserPage.clickDeleteAccountButton();
    }

    @Then("Verify that ACCOUNT DELETED is visible and click continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        registerUserPage.getDeleteAccountTitle();
    }

//    @After
//    public void tearDown(){
//        reusableMethods.threadWait(5);
//        Driver.closeDriver();
//    }
}
