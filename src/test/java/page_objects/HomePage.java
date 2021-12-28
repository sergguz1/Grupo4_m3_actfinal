package page_objects;

import net.serenitybdd.core.pages.PageObject;
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

    public WebElement getFirstPhoneLabel() {
        return firstPhoneLabel;
    }

    public WebElement getFirstLaptopLabel() {
        return firstLaptopLabel;
    }

    public WebElement getFirstMonitorLabel() {
        return firstMonitorLabel;
    }

    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[1]/div/div/h4/a")
    WebElement firstPhoneLabel;

    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[1]/div/div/h4/a")
    WebElement firstLaptopLabel;

    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[1]/div/div/h4/a")
    WebElement firstMonitorLabel;

    @FindBy(how = How.ID, using = "sign-username")
    WebElement textBoxUsernameSignUp;
    @FindBy(how = How.ID, using = "sign-password")
    WebElement textBoxPasswordSignUp;
    @FindBy(how = How.XPATH, using = "//*[@id='signInModal']/div/div/div[3]/button[2]")
    WebElement buttonSignIn;

    @FindBy(how = How.ID, using = "loginusername")
    WebElement textBoxUsernameLogIn;
    @FindBy(how = How.ID, using = "loginpassword")
    WebElement textBoxPasswordLogIn;
    @FindBy(how = How.XPATH, using = "//*[@id='logInModal']/div/div/div[3]/button[2]")
    WebElement buttonLogIn;



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

    public WebElement getWelcomeLabelNavBar() {
        return welcomeLabelNavBar;
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
        return firstMonitorLabel.getText();
    }

    //New
    public HomePage openSignUpModal(){
        signUpButton.click();
        return this;
    }
    public HomePage fillInSignUp(String username, String password){
        driver.switchTo().activeElement();
        textBoxUsernameSignUp.sendKeys(username);
        textBoxPasswordSignUp.sendKeys(password);
        buttonSignIn.click();
//        driver.findElement(By.xpath("//*[@id='sign-username']")).sendKeys(username);
//        driver.findElement(By.id("sign-password")).sendKeys(password);
//        driver.findElement(By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]")).click();
        return this;
    }
    public HomePage openLogInModal(){
        loginButton.click();
        return this;
    }
    public HomePage fillInLogIn(String username, String password){
        driver.switchTo().activeElement();
        textBoxUsernameLogIn.sendKeys(username);
        textBoxPasswordLogIn.sendKeys(password);
        buttonLogIn.click();
        return this;
    }
}
