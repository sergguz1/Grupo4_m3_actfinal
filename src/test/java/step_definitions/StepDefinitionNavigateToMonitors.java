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

public class StepDefinitionNavigateToMonitors {
    private WebDriver driver;
    private WebDriverWait wait;
    HomePage homePage;

    String username = "user_9";
    String password = "user_9";

    @Before("@Test_MonitorListing")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Given("I am at the home page_monitor_listing")
    public void i_am_at_the_home_page_monitor_listing() {
        driver.get("https://www.demoblaze.com/");
        homePage.clickLogin();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.switchTo().activeElement();
        driver.findElement(By.id("loginusername")).sendKeys(username);
        driver.findElement(By.id("loginpassword")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]")).click();
        assertThat(homePage.getWelcomeLabelNavBarText()).isEqualToIgnoringCase("Welcome " + username);
    }
    @When("I press the Monitors button")
    public void i_press_the_monitors_button() {
        homePage.clickMonitor();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    @Then("I should see the monitors list")
    public void i_should_see_the_monitors_list() {
        assertThat(homePage.getFirstMonitorLabelText()).isEqualToIgnoringCase("Apple monitor 24");
    }
}
