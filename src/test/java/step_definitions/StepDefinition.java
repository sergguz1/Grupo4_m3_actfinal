package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_objects.HomePage;
import page_objects.SignUpForm;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class StepDefinition {
    private WebDriver driver;
    private WebDriverWait wait;
    HomePage homePage;
    //SignUpForm signUpForm;

    String username = "user_9";
    String password = "user_9";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        //signUpForm = new SignUpForm(driver);
    }

    @Given("I am at the home page")
    public void i_am_at_the_home_page() {
        driver.get("https://www.demoblaze.com/");
    }
    @When("I press the sign up button")
    public void i_press_the_sign_up_button() {
        homePage.clickSignIn();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //signUpForm = new SignUpForm(driver);
        //System.out.println(signUpForm.getSignInModalTitle());
        //assertThat(signUpForm.getSignInModalTitle()).isEqualToIgnoringCase("Sign up");
        //System.out.println(homePage.getSignInModalTitle());
    }
    @When("I enter my new credentials")
    public void i_enter_my_new_credentials() {
        driver.switchTo().activeElement();
        driver.findElement(By.xpath("//*[@id='sign-username']")).sendKeys(username);
        //driver.findElement(By.id("sign-password")).click();
        driver.findElement(By.id("sign-password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]")).click();
        //assertThat(driver.switchTo().alert().getText()).isEqualToIgnoringCase("Sign up successful.");

    }
    @Then("I should see the confirmation message saying signup successful")
    public void i_should_see_the_confirmation_message_saying_signup_successful() {
        assertThat(driver.switchTo().alert().getText()).isEqualToIgnoringCase("Sign up successful.");
        driver.switchTo().alert().accept();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        assertThat(homePage.getWelcomeLabelNavBarText()).isEqualToIgnoringCase("Welcome " + username);
    }
}
