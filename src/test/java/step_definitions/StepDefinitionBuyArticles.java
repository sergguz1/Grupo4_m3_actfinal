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

public class StepDefinitionBuyArticles {

    private WebDriver driver;
    private WebDriverWait wait;
    HomePage homePage;

    String username = "user_9";
    String password = "user_9";

    String name = "test_name";
    String country = "test_country";
    String city = "test_city";
    String card = "test_card";
    String month = "test_month";
    String year = "test_year";

    @Before("@Test_BuyArticles")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Given("I place a order")
    public void i_place_a_order() {
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        homePage.wait_sleep(2000);
        homePage.clickCart();
        homePage.wait_sleep(3000);
        homePage.clickOrderButton();
    }

    @When("I put my data")
    public void i_put_my_data() {
        homePage.wait_sleep(3000);
        homePage.fillInPurchase(name,country,city,card,month,year);

    }
    @Then("I make a order")
    public void i_make_a_order() {
        homePage.wait_sleep(2000);
        homePage.clickPurchase();
        homePage.wait_sleep(3000);
        homePage.clickOkPurchase();
        homePage.wait_sleep(5000);
        driver.quit();
    }
}
