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
import java.util.concurrent.TimeUnit;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitionNavigateToLaptops {
    private WebDriver driver;
    private WebDriverWait wait;
    HomePage homePage;

    String username = "user_9";
    String password = "user_9";

    @Before("@Test_LaptopListing")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Given("I am at the home page_laptop_listing")
    public void i_am_at_the_home_page_laptop_listing() {
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        homePage.openLogInModal().fillInLogIn(username, password);
        wait.until(ExpectedConditions.visibilityOf(homePage.getWelcomeLabelNavBar()));
        String welcomeText = homePage.getWelcomeLabelNavBarText();
        assertThat(welcomeText).isEqualToIgnoringCase("Welcome " + username);
    }
    @When("I press the Laptops button")
    public void i_press_the_laptops_button() {
        homePage.clickLaptops();
    }
    @Then("I should see the laptops list")
    public void i_should_see_the_laptops_list() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String laptopLabelText = homePage.getFirstLaptopLabelText();
        //System.out.println(laptopLabelText);
        assertThat(laptopLabelText).isEqualToIgnoringCase("Sony vaio i5");
    }
}
