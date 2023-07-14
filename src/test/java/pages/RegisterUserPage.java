package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitise.Driver;
import utilitise.ReusableMethods;

public class RegisterUserPage extends ReusableMethods {
    WebDriver driver;
   public RegisterUserPage(){
        this.driver = Driver.getDriver();
       PageFactory.initElements(driver, this);
    }
    @FindBy(css = "img[alt='Website for automation practice']")
    private WebElement homePageIsVisible;
    public void homePage (){
       isDisplayed(homePageIsVisible);
    }

    @FindBy(xpath = "//li[4]/a/i[@class='fa fa-lock']")
    private WebElement signUpAndLogin;
    public void signUpAndLoginButtonClick(){
        clickFunction(signUpAndLogin);
    }

    @FindBy(xpath = "//h2[.='New User Signup!']")
    private WebElement newUserTitle;
    public void newUserTitleVisible(){
        isDisplayed(newUserTitle);
    }

    @FindBy(xpath = "//input[@ placeholder ='Name']")
    private WebElement nameElement;
    @FindBy(xpath = "//input[@ data-qa ='signup-email']")
    private WebElement emailElement;
    public void setNameAndEmail(String name, String email){
        sendKeysFunction(nameElement,name);
        sendKeysFunction(emailElement,email);
    }

    @FindBy(xpath = "//button[@ data-qa ='signup-button']")
    private WebElement signupButton;
    public void signupButtonClick (){
        clickFunction(signupButton);
    }

    @FindBy(xpath = "//b[. ='Enter Account Information']")
    private WebElement accountInformationText;
    public void accountInformationTextVisible(){
        isDisplayed(accountInformationText);
    }

    @FindBy(id = "id_gender1")
    private WebElement titleSelect;
    public void setTitleSelect(){
        isEnabled(titleSelect);
    }

    @FindBy(id = "password")
    private WebElement password;
    public void setPassword(String value){
        sendKeysFunction(password, value);
    }

    @FindBy(id = "days")
    private WebElement dayElement;
    @FindBy(id = "months")
    private WebElement monthElement;
    @FindBy(id = "years")
    private WebElement yearElement;
    public void selectData(String day, String month, String year){
        selectElementFromDropDown(dayElement,day);
        selectElementFromDropDown(monthElement,month);
        selectElementFromDropDown(yearElement,year);
    }

    @FindBy(id = "newsletter")
    private WebElement checkBoxNewsletter;
    public void selectCheckBoxNewsletter(){
        isEnabled(checkBoxNewsletter);
    }

    @FindBy(id = "optin")
    private WebElement checkBoxPartners;
    public void selectCheckPartners(){
        isEnabled(checkBoxNewsletter);
    }

    @FindBy(id = "first_name")
    private WebElement firstNameElement;
    @FindBy(id = "last_name")
    private WebElement lastNameElement;
    @FindBy(id = "company")
    private WebElement companyElement;
    @FindBy(id = "address1")
    private WebElement addressOneElement;
    @FindBy(id = "address2")
    private WebElement addressTowElement;
    @FindBy(id = "country")
    private WebElement countryElement;
    @FindBy(id = "state")
    private WebElement stateElement;
    @FindBy(id = "city")
    private WebElement cityElement;
    @FindBy(id = "zipcode")
    private WebElement zipcodeElement;
    @FindBy(id = "mobile_number")
    private WebElement mobileNumberElement;
    @FindBy(xpath = "//button[.='Create Account']")
    private WebElement createButton;


    public void personalInfoPartOne (String firstName, String lastName, String company, String addressLineOne, String addressLineTwo){
        sendKeysFunction(firstNameElement, firstName);
        sendKeysFunction(lastNameElement, lastName);
        sendKeysFunction(companyElement, company);
        sendKeysFunction(addressOneElement, addressLineOne);
        sendKeysFunction(addressTowElement, addressLineTwo);
    }
    public void personalInfoPartTow (String country, String state, String city, String zipcode, String mobileNumber){
        sendKeysFunction(companyElement, country);
        sendKeysFunction(stateElement, state);
        sendKeysFunction(cityElement, city);
        sendKeysFunction(zipcodeElement,zipcode);
        sendKeysFunction(mobileNumberElement, mobileNumber);
    }
    public void clickCreateButton (){
        clickFunction(createButton);
    }

    @FindBy(xpath = "//b[.='Account Created!']")
    private WebElement accountCreatedElement;
    public void accountCreatedTextIsVisibly(){
        isDisplayed(accountCreatedElement);
    }

    @FindBy(linkText = "Continue")
    private WebElement continueButtonElement;
    @FindBy(id = "dismiss-button")
    private WebElement dismissButton;
    public void continueButton(){
        clickFunction(continueButtonElement);
        driver.switchTo().frame("google_esf");
        clickFunction(dismissButton);
    }

    @FindBy(xpath = "(//ul/li/a)[10]")
    private WebElement userNameGet;
    public void userNameVisible(){
        isDisplayed(userNameGet);
    }

    @FindBy(xpath = "(//ul/li/a)[5]")
    private WebElement deleteAccount;
    public void clickDeleteAccountButton(){
        clickFunction(deleteAccount);
    }

    @FindBy(xpath = "//b[.='Account Deleted!']")
    private WebElement deleteAccountTitle;
    public void getDeleteAccountTitle(){
        isDisplayed(deleteAccountTitle);
    }




}
