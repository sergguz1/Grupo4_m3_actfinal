package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_objects.HomePage;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitionSignUp {
    private WebDriver driver;
    private WebDriverWait wait;
    HomePage homePage;
    //SignUpForm signUpForm;

    String username = "user_8";
    String password = "user_8";

    @Before("@Test_SignUp")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Given("I am at the home page")
    public void i_am_at_the_home_page() {
        driver.get("https://www.demoblaze.com/");
    }
    @When("I press the sign up button")
    public void i_press_the_sign_up_button() {
        homePage.clickSignIn();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    @When("I enter my new credentials")
    public void i_enter_my_new_credentials() {
        driver.switchTo().activeElement();
        driver.findElement(By.xpath("//*[@id='sign-username']")).sendKeys(username);
        driver.findElement(By.id("sign-password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]")).click();

    }
    @Then("I should see the confirmation message saying signup successful")
    public void i_should_see_the_confirmation_message_saying_signup_successful() {
        assertThat(driver.switchTo().alert().getText()).isEqualToIgnoringCase("Sign up successful.");
        driver.switchTo().alert().accept();
    }
}
