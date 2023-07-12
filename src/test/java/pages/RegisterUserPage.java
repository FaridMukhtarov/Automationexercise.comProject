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

}
