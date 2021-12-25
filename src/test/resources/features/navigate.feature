Feature: navigate

  In order to buy some products
  As a customer
  I want to be able to sign up and to log in, then navigate through the different product types and also to
  be able to add them to the basket, I also want to be able to remove items from it and place my order

  Scenario: Signing up on the online store for the first time
    Given I am at the home page
    When I press the sign up button
    And I enter my new credentials
    Then I should see the confirmation message saying signup successful

#  Scenario: Logging in on the online store
#    Given I am at the home page
#    When I press the log in button
#    And I enter my credentials
#    Then I should see the label on the top right corner as welcome and my username
#
#  Scenario: Navigating on the phone listing
#    Given I am at the home page
#    When I press the Phones button
#    Then I should see the phones list
#
#  Scenario: Navigating on the laptop listing
#    Given I am at the home page
#    When I press the Laptops button
#    Then I should see the laptops list
#
#  Scenario: Navigating on the monitors listing
#    Given I am at the home page
#    When I press the Monitors button
#    Then I should see the monitors list
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