@Android @Register
Feature: Register new User

  @RegisterPositive
  Scenario: Successfully register new user
    Given User is on test app login page
    When User click register button from login
    And User input name "agungsusilo" on name field
    And User input email "agung@gmail.com" on email field
    And User input password "mantap" on password field
    And User input password "mantap" on confirmation password field
    And User click register button
    Then User see registration success message

  @RegisterNegative
  Scenario: register new user with blank name
    Given User is on test app login page
    When User click register button from login
    And User input name "" on name field
    And User input email "agung@gmail.com" on email field
    And User input password "mantap" on password field
    And User input password "mantap" on confirmation password field
    And User click register button
    Then User see name field error message
