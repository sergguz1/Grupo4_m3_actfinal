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

    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[1]/div/div/h4/a")
    WebElement S6button;
    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[2]/div/a")
    WebElement addS6button;

    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[4]/div/div/h4/a")
    WebElement S7button;
    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[2]/div/a")
    WebElement addS7button;

    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[2]/div/div/h4/a")
    WebElement i7button;
    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[2]/div/a")
    WebElement addi7button;

    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/tr/td[4]/a")
    WebElement deleteS6Button;

    @FindBy(how = How.XPATH, using = "//*[@id='page-wrapper']/div/div[2]/button")
    WebElement orderButton;

    @FindBy(how = How.ID, using = "name")
    WebElement textBoxName;
    @FindBy(how = How.ID, using = "country")
    WebElement textBoxCountry;
    @FindBy(how = How.ID, using = "city")
    WebElement textBoxCity;
    @FindBy(how = How.ID, using = "card")
    WebElement textBoxCard;
    @FindBy(how = How.ID, using = "month")
    WebElement textBoxMonth;
    @FindBy(how = How.ID, using = "year")
    WebElement textBoxYear;
    @FindBy(how = How.XPATH, using = "//*[@id='orderModal']/div/div/div[3]/button[2]")
    WebElement confirmPurchaseButton;
    @FindBy(how = How.XPATH, using = "/html/body/div[10]/h2")
    WebElement purchaseResponse;
    @FindBy(how = How.XPATH, using = "/html/body/div[10]/div[7]/div/button")
    WebElement okPurchaseButton;



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
    public void wait_sleep(int num){
        try {
            Thread.sleep(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public HomePage fillInSignUp(String username, String password){
        driver.switchTo().activeElement();
        wait_sleep(2000);
        textBoxUsernameSignUp.sendKeys(username);
        wait_sleep(2000);
        textBoxPasswordSignUp.sendKeys(password);
        wait_sleep(2000);
        buttonSignIn.click();
        return this;
    }
    public HomePage openLogInModal(){
        loginButton.click();
        return this;
    }
    public HomePage fillInLogIn(String username, String password){
        driver.switchTo().activeElement();
        wait_sleep(2000);
        textBoxUsernameLogIn.sendKeys(username);
        wait_sleep(2000);
        textBoxPasswordLogIn.sendKeys(password);
        wait_sleep(2000);
        buttonLogIn.click();
        return this;
    }

    public void clickS6Button(){ S6button.click(); }
    public void clickAddS6Button(){ addS6button.click(); }

    public void clickS7Button(){ S7button.click(); }
    public void clickAddS7Button(){ addS7button.click(); }

    public void clicki7Button(){ i7button.click(); }
    public void clickAddi7Button(){ addi7button.click(); }

    public void clickDeleteS6Button(){ deleteS6Button.click(); }

    public void clickOrderButton(){ orderButton.click(); }

    public HomePage fillInPurchase(String name, String country, String city, String card, String month, String year){
        driver.switchTo().activeElement();
        wait_sleep(2000);
        textBoxName.sendKeys(name);
        wait_sleep(2000);
        textBoxCountry.sendKeys(country);
        wait_sleep(2000);
        textBoxCity.sendKeys(city);
        wait_sleep(2000);
        textBoxCard.sendKeys(card);
        wait_sleep(2000);
        textBoxMonth.sendKeys(month);
        wait_sleep(2000);
        textBoxYear.sendKeys(year);
        wait_sleep(2000);
        confirmPurchaseButton.click();
        return this;
    }

    public void clickPurchase(){ confirmPurchaseButton.click(); }

    public String getPurchaseText(){ return purchaseResponse.getText(); }

    public void clickOkPurchase(){ okPurchaseButton.click(); }
}
