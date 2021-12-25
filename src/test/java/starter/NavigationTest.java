package starter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import step_definitions.StepDefinition;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/navigate.feature",
                 glue = {"step_definitions"})
public class NavigationTest {
    StepDefinition stepDefinition;
    @Test
    public void should_sign_up(){
        stepDefinition.i_am_at_the_home_page();
        stepDefinition.i_press_the_sign_up_button();
        stepDefinition.i_enter_my_new_credentials();
        stepDefinition.i_should_see_the_confirmation_message_saying_signup_successful();
    }
}
