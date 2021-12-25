package page_objects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageObject{

    private WebDriver driver;

    @FindBy(how = How.ID, using = "signin2")
    WebElement signUpButton;

    @FindBy(how = How.ID, using = "login2")
    WebElement loginButton;

    @FindBy(how = How.ID, using = "cartur")
    WebElement cartButton;

    @FindBy(how = How.ID, using = "nameofuser")
    WebElement welcomeLabelNavBar;

//    @FindBy(how = How.ID, using = "signInModalLabel")
//    WebElement title;
//
//    @FindBy(how = How.ID, using = "signInModal")
//    WebElementFacade signInModal;
//
//    @FindBy(how = How.ID, using = "sign-username")
//    WebElementFacade textBoxUsername;
//
//    @FindBy(how = How.ID, using = "sign-password")
//    WebElementFacade textBoxPassword;
//
//    @FindBy(how = How.CSS, using = ".btn.btn-primary")
//    WebElementFacade signUpModalButton;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickSignIn(){
        signUpButton.click();
    }

    public void clickLogin(){
        loginButton.click();
    }

    public void clickCart(){
        cartButton.click();
    }

    public String getWelcomeLabelNavBarText(){
        return welcomeLabelNavBar.getText();
    }



//    public String getSignInModalTitle(){
//        signInModal.waitUntilVisible();
//        return title.getText();
//    }
//
//    public void enterUsername(String value){
//        textBoxUsername.type(value);
//    }
//
//    public void enterPassword(String value){
//        textBoxPassword.type(value);
//    }
//
//    public void clickSignUpModalButton(){
//        signUpModalButton.click();
//    }
}
