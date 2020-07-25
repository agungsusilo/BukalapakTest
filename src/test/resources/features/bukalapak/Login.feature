@Web @Login
Feature: Login to home page

  Scenario: Register new User
    Given User is open bukalapak page
    When User click button Login
    And User input email "agungganteng@gmail.com" on Login page
    And User input "mantap123" on login password field
    And User click Login Button
    Then User is on bukalapak homepage
