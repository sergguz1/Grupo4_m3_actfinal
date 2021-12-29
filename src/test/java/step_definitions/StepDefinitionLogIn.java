package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.openqa.selenium.By;//mala
import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_objects.HomePage;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitionLogIn {
    private WebDriver driver;
    private WebDriverWait wait;
    HomePage homePage;

    String username = "user_9";
    String password = "user_9";

    @Before("@Test_LogIn")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Given("I am at the home page_log_in")
    public void i_am_at_the_home_page_log_in() {
        driver.get("https://www.demoblaze.com/");
    }

    @When("I press the log in button")
    public void i_press_the_log_in_button() {
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    @When("I enter my credentials")
    public void i_enter_my_credentials() {
        homePage.openLogInModal().fillInLogIn(username, password);
    }
    @Then("I should see the label on the top right corner as welcome and my username")
    public void i_should_see_the_label_on_the_top_right_corner_as_welcome_and_my_username() {
        wait.until(ExpectedConditions.visibilityOf(homePage.getWelcomeLabelNavBar()));
        String welcomeText = homePage.getWelcomeLabelNavBarText();
        assertThat(welcomeText).isEqualToIgnoringCase("Welcome " + username);
        homePage.wait_sleep(5000);
        driver.quit();
    }
}
