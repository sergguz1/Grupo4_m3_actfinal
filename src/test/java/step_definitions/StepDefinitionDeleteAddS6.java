package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.HomePage;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitionDeleteAddS6 {

    private WebDriver driver;
    HomePage homePage;

    String username = "user_9";
    String password = "user_9";

    @Before("@Test_DeleteAddedS6")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Given("I added the s6")
    public void i_added_the_s6() {
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        homePage.wait_sleep(2000);
        homePage.clickS6Button();
        homePage.wait_sleep(2000);
        homePage.clickAddS6Button();
        homePage.wait_sleep(2000);
        String alertText = driver.switchTo().alert().getText();
        assertThat(alertText).isEqualToIgnoringCase("Product added");
        driver.switchTo().alert().accept();
        homePage.wait_sleep(3000);
    }

    @When("I am at cart page")
    public void i_am_at_cart_page(){
        homePage.clickCart();
        homePage.wait_sleep(4000);
    }

    @Then("I delete the s6")
    public void i_delete_the_s6(){
        homePage.clickDeleteS6Button();
        homePage.wait_sleep(5000);
        driver.quit();
    }
}
