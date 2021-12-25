package page_objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpForm extends PageObject{
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(how = How.ID, using = "signInModalLabel")
    WebElementFacade title;

    @FindBy(how = How.ID, using = "signInModal")
    WebElementFacade signInModal;

    @FindBy(how = How.ID, using = "sign-username")
    WebElementFacade textBoxUsername;

    @FindBy(how = How.ID, using = "sign-password")
    WebElementFacade textBoxPassword;

    @FindBy(how = How.CSS, using = ".btn.btn-primary")
    WebElementFacade signUpModalButton;

    public SignUpForm(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public String getSignInModalTitle(){
        //signInModal.waitUntilVisible();
        return title.getText();
    }

    public void enterUsername(String value){
        textBoxUsername.type(value);
    }

    public void enterPassword(String value){
        textBoxPassword.type(value);
    }

    public void clickSignUpModalButton(){
        signUpModalButton.click();
    }

}
