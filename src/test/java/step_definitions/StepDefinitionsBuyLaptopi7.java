package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_objects.HomePage;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitionsBuyLaptopi7 {

    private WebDriver driver;
    HomePage homePage;

    String username = "user_9";
    String password = "user_9";

    @Before("@Test_BuyLaptopi7")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Given("I am at the Laptop i7 page")
    public void i_am_at_the_Laptop_i7_page() {
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        homePage.wait_sleep(2000);
        homePage.clickLaptops();
        homePage.wait_sleep(2000);
        homePage.clicki7Button();
    }

    @When("I add a Laptop i7")
    public void i_add_a_Laptop_i7(){
        homePage.wait_sleep(2000);
        homePage.clickAddi7Button();
    }

    @Then("I added a Laptop i7")
    public void i_added_a_Laptop_i7(){
        homePage.wait_sleep(2000);
        String alertText = driver.switchTo().alert().getText();
        assertThat(alertText).isEqualToIgnoringCase("Product added");
        driver.switchTo().alert().accept();
        homePage.wait_sleep(5000);
        driver.quit();
    }
}
