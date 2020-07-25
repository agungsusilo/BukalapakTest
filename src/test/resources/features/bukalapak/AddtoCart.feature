@Web @AddtoCart
Feature: Add to Cart

  Background:
    Given User is open bukalapak page
    And User click button Login
    And User input email "agungganteng@gmail.com" on Login page
    And User input "mantap123" on login password field
    And User click Login Button
    And User is on bukalapak homepage

  Scenario: Adding product to cart
    Given User input "headset" on search box + enter keys
    When  User see search result page
    And User click first result
    And User click addtocart button
    Then User see the product is added
