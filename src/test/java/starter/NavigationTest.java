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
    StepDefinitionBuyPhoneS6 stepDefinitionBuyPhoneS6;
    StepDefinitionBuyPhoneS7 stepDefinitionBuyPhoneS7;
    StepDefinitionsBuyLaptopi7 stepDefinitionsBuyLaptopi7;
    StepDefinitionDeleteAddS6 stepDefinitionDeleteAddS6;
    StepDefinitionBuyArticles stepDefinitionBuyArticles;

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

        @Test
    public void should_buy_phone_s6(){
        stepDefinitionBuyPhoneS6.i_am_at_the_phone_s6_page();
        stepDefinitionBuyPhoneS6.i_add_a_s6_phone();
        stepDefinitionBuyPhoneS6.i_added_a_s6_phone();
    }

    @Test
    public void should_buy_phone_s7(){
        stepDefinitionBuyPhoneS7.i_am_at_the_phone_s7_page();
        stepDefinitionBuyPhoneS7.i_add_a_s7_phone();
        stepDefinitionBuyPhoneS7.i_added_a_s7_phone();
    }

    @Test
    public void should_buy_laptop_i7(){
        stepDefinitionsBuyLaptopi7.i_am_at_the_Laptop_i7_page();
        stepDefinitionsBuyLaptopi7.i_add_a_Laptop_i7();
        stepDefinitionsBuyLaptopi7.i_added_a_Laptop_i7();
    }

    @Test
    public void should_delete_s6(){
        stepDefinitionDeleteAddS6.i_added_the_s6();
        stepDefinitionDeleteAddS6.i_am_at_cart_page();
        stepDefinitionDeleteAddS6.i_delete_the_s6();
    }

    @Test
    public void should_place_a_order(){
        stepDefinitionBuyArticles.i_place_a_order();
        stepDefinitionBuyArticles.i_put_my_data();
        stepDefinitionBuyArticles.i_make_a_order();
    }
}
