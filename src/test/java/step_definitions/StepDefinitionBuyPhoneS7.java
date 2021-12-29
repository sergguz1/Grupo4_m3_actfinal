package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_objects.HomePage;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitionBuyPhoneS7 {

    private WebDriver driver;
    HomePage homePage;

    String username = "user_9";
    String password = "user_9";

    @Before("@Test_BuyPhoneS7")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Given("I am at the phone S7 page")
    public void i_am_at_the_phone_s7_page() {
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        homePage.wait_sleep(2000);
        homePage.clickS7Button();
    }

    @When("I add a S7 phone")
    public void i_add_a_s7_phone(){
        homePage.wait_sleep(2000);
        homePage.clickAddS7Button();
    }

    @Then("I added a S7 phone")
    public void i_added_a_s7_phone(){
        homePage.wait_sleep(2000);
        String alertText = driver.switchTo().alert().getText();
        assertThat(alertText).isEqualToIgnoringCase("Product added");
        driver.switchTo().alert().accept();
        homePage.wait_sleep(5000);
        String laptopLabelText = homePage.getPurchaseText();
        assertThat(laptopLabelText).isEqualToIgnoringCase("Thank you for your purchase!");
        homePage.wait_sleep(2000);

        homePage.wait_sleep(2000);
        driver.quit();
    }
}
