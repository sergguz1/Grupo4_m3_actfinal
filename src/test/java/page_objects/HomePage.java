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

    @FindBy(how = How.XPATH, using = "/html/body/div[5]/div/div[1]/div/a[2]")
    WebElement phoneButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[5]/div/div[1]/div/a[3]")
    WebElement laptopButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[5]/div/div[1]/div/a[4]")
    WebElement monitorButton;

    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[1]/div/div/h4/a")
    WebElement firstPhoneLabel;

    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[1]/div/div/h4/a")
    WebElement firstLaptopLabel;

    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[1]/div/div/h4/a")
    WebElement firstMonitoLabel;

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

    public void clickPhones(){
        phoneButton.click();
    }

    public void clickLaptops(){
        laptopButton.click();
    }

    public void clickMonitor(){
        monitorButton.click();
    }

    public String getFirstPhoneLabelText(){
        return firstPhoneLabel.getText();
    }

    public String getFirstLaptopLabelText(){
        return firstLaptopLabel.getText();
    }

    public String getFirstMonitorLabelText(){
        return firstMonitoLabel.getText();
    }
}
