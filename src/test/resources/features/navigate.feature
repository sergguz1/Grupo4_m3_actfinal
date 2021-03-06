Feature: navigate

  In order to buy some products
  As a customer
  I want to be able to sign up and to log in, then navigate through the different product types and also to
  be able to add them to the basket, I also want to be able to remove items from it and place my order

  @Test_SignUp
  Scenario: Signing up on the online store for the first time
    Given I am at the home page
    When I press the sign up button
    And I enter my new credentials
    Then I should see the confirmation message saying signup successful

  @Test_LogIn
  Scenario: Logging in on the online store
    Given I am at the home page_log_in
    When I press the log in button
    And I enter my credentials
    Then I should see the label on the top right corner as welcome and my username

  @Test_PhoneListing
  Scenario: Navigating on the phone listing
    Given I am at the home page_phone_listing
    When I press the Phones button
    Then I should see the phones list

  @Test_LaptopListing
  Scenario: Navigating on the laptop listing
    Given I am at the home page_laptop_listing
    When I press the Laptops button
    Then I should see the laptops list

  @Test_MonitorListing
  Scenario: Navigating on the monitors listing
    Given I am at the home page_monitor_listing
    When I press the Monitors button
    Then I should see the monitors list

  @Test_BuyPhoneS6
  Scenario: Buy Phone S6
    Given I am at the phone S6 page
    When I add a S6 phone
    Then I added a S6 phone

  @Test_BuyPhoneS7
  Scenario: Buy Phone S7
    Given I am at the phone S7 page
    When I add a S7 phone
    Then I added a S7 phone

  @Test_BuyLaptopi7
  Scenario: Buy Laptop i7
    Given I am at the Laptop i7 page
    When I add a Laptop i7
    Then I added a Laptop i7

  @Test_DeleteAddedS6
  Scenario: Delete added S6
    Given I added the s6
    When I am at cart page
    Then I delete the s6

  @Test_BuyArticles
  Scenario: Buy articles
    Given I place a order
    When I put my data
    Then I make a order
#
#  Scenario: Adding products to the basket
#    Given I want to products to the basket
#    When I press the Add to cart button on the product page
#    Then I should see the confirmation message saying the product was added
#
#  Scenario: Eliminating one product from the basket
#    Given I am at the cart page
#    When I press the delete button next to the item I want to remove
#    Then I should see the basket item list updated without the removed item
#
#  Scenario: Placing an order
#    Given I am at the cart page
#    When I press the place order button, fill in the information form
#    And I press the purchase button
#    Then I should see the confirmation pop up thanking me for the purchase and with the order information