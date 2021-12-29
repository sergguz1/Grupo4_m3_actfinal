package starter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import step_definitions.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/navigate.feature",
                 glue = {"step_definitions"})
public class NavigationTest {
    StepDefinitionSignUp stepDefinitionSignUp;
    StepDefinitionLogIn stepDefinitionLogIn;
    StepDefinitionNavigateToPhones stepDefinitionNavigateToPhones;
    StepDefinitionNavigateToLaptops stepDefinitionNavigateToLaptops;
    StepDefinitionNavigateToMonitors stepDefinitionNavigateToMonitors;
    @Test
    public void should_sign_up(){
        stepDefinitionSignUp.i_am_at_the_home_page();
        stepDefinitionSignUp.i_press_the_sign_up_button();
        stepDefinitionSignUp.i_enter_my_new_credentials();
        stepDefinitionSignUp.i_should_see_the_confirmation_message_saying_signup_successful();
    }

    @Test
    public void should_log_in(){
        stepDefinitionLogIn.i_am_at_the_home_page_log_in();
        stepDefinitionLogIn.i_press_the_log_in_button();
        stepDefinitionLogIn.i_enter_my_credentials();
        stepDefinitionLogIn.i_should_see_the_label_on_the_top_right_corner_as_welcome_and_my_username();
    }

    @Test
    public void should_see_phones_listing(){
        stepDefinitionNavigateToPhones.i_am_at_the_home_page_phone_listing();
        stepDefinitionNavigateToPhones.i_press_the_phones_button();
        stepDefinitionNavigateToPhones.i_should_see_the_phones_list();
    }

    @Test
    public void should_see_laptops_listing(){
        stepDefinitionNavigateToLaptops.i_am_at_the_home_page_laptop_listing();
        stepDefinitionNavigateToLaptops.i_press_the_laptops_button();
        stepDefinitionNavigateToLaptops.i_should_see_the_laptops_list();
    }

    @Test
    public void should_see_monitors_listing(){
        stepDefinitionNavigateToMonitors.i_am_at_the_home_page_monitor_listing();
        stepDefinitionNavigateToMonitors.i_press_the_monitors_button();
        stepDefinitionNavigateToMonitors.i_should_see_the_monitors_list();
    }
}
