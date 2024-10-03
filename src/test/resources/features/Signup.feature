#Author: rahul_nalawade
#Registration
Feature: User Registration on Automation exercise

  @Registration
  Scenario: User signup
    Given User launch website "https://automationexercise.com/"
    And User verify that home page is visible successfully
    And User click on 'Signup / Login' link
    And User verify 'New User Signup!' is visible
    And User enter following name and email address
      | Rahul | rahulnalawade@xorint.com |
    Then User click on 'Signup' button on home screen
    And User verify 'Enter Account Information' is visible
    And User fill all the following details to create account
      | Title     | Mr.         |
      | Password  | Test@123    |
      | DOB       | 3/4/1992    |
      | FirstName | Rahul       |
      | LastName  | Nalawade    |
      | Company   | Xoriant     |
      | Address   | Otur        |
      | Country   | India       |
      | State     | Maharashtra |
      | City      | Pune        |
      | Zipcode   | 412409      |
      | MobileNo  | 9999999999  |
    When User click on 'Create Account' button
    Then User verify 'Account Created!' is visible
    And User click on 'Continue' button
    And User verify "Logged in as Rahul" is visible on home screen
    When User click on 'Delete Account' button
    Then User verify 'Account Deleted!' is visible
    And User click on 'Continue' button
    And User close the browser

  @AddToCart
  Scenario: User verify add products in cart
    Given User launch website "https://automationexercise.com/"
    And User verify that home page is visible successfully
    And User click on 'Products' link button
    When User Hover over first product and click on Add to cart
    And User click on 'Continue Shopping' button
    And User Hover over second product and click on Add to cart
    And User click on 'View Cart' button
    Then User verify added product in cart with name, price, quantity and total
    And User close the browser

  @CheckoutProduct
  Scenario: User verify address details in checkout page
    Given User launch website "https://automationexercise.com/"
    And User verify that home page is visible successfully
    And User click on 'Signup / Login' link
    And User verify 'New User Signup!' is visible
    And User enter following name and email address
      | Rahul | rahulnalawade@xorint.com |
    Then User click on 'Signup' button on home screen
    And User verify 'Enter Account Information' is visible
    And User fill all the following details to create account
      | Title     | Mr.         |
      | Password  | Test@123    |
      | DOB       | 3/4/1992    |
      | FirstName | Rahul       |
      | LastName  | Nalawade    |
      | Company   | Xoriant     |
      | Address   | Otur        |
      | Country   | India       |
      | State     | Maharashtra |
      | City      | Pune        |
      | Zipcode   | 412409      |
      | MobileNo  | 9999999999  |
    When User click on 'Create Account' button
    Then User verify 'Account Created!' is visible
    And User click on 'Continue' button
    And User verify "Logged in as Rahul" is visible on home screen
    And User click on 'Products' link button
    When User Hover over first product and click on Add to cart
    And User click on 'Continue Shopping' button
    And User Hover over second product and click on Add to cart
    And User click on 'View Cart' button
    Then User verify added product in cart with name, price, quantity and total
    And User click on Proceed To Checkout button on cart screen
    And User verify delivery address is same address filled at the time registration of account
    And User billing address is same address filled at the time registration of account
    When User click on 'Delete Account' button
    Then User verify 'Account Deleted!' is visible
    And User click on 'Continue' button