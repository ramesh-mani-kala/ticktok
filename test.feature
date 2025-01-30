@feature
Feature: Cucumber Test Cases

  @high
  Scenario: Failing Scenario - Login with incorrect password
    Given User enters username "admin"
    And User enters password "wrongpassword"
    When User clicks login button
    Then Login should fail

  @high
  Scenario: Failing Scenario - Searching for a non-existing product
    Given User is on the search page
    When User searches for "UnknownProduct"
    Then No results should be displayed

  Scenario: Failing Scenario - Adding negative quantity to cart
    Given User is on the cart page
    When User adds -5 quantity of "Laptop"
    Then System should show an error message

  Scenario: Failing Scenario - Checking out without items
    Given User is on the checkout page
    When User tries to checkout
    Then Checkout should be disabled

  Scenario: Failing Scenario - Payment with invalid card
    Given User enters an invalid credit card number
    When User submits payment
    Then Payment should fail

  @high
  Scenario: Passing Scenario - Login with correct credentials
    Given User enters username "admin"
    And User enters password "admin123"
    When User clicks login button
    Then Login should be successful

  Scenario: Passing Scenario - Searching for an existing product
    Given User is on the search page
    When User searches for "Laptop"
    Then Search results should show relevant products

  Scenario: Passing Scenario - Adding item to cart
    Given User is on the product page of "Phone"
    When User adds it to cart
    Then Item should be added successfully

  Scenario: Passing Scenario - Checking out with valid items
    Given User has items in cart
    When User proceeds to checkout
    Then Checkout should be successful

  Scenario: Passing Scenario - Payment with valid card
    Given User enters a valid credit card number
    When User submits payment
    Then Payment should be successful
