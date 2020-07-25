@Android @Login
Feature: Login

  Background:
    Given User is on test app login page
    And User click register button from login
    And User input name "agungsusilo" on name field
    And User input email "agung@gmail.com" on email field
    And User input password "mantap" on password field
    And User input password "mantap" on confirmation password field
    And User click register button
    And User see registration success message
    And User click login link

  @LoginPositive
  Scenario: USer successfully Login
    Given User is on test app login page
    And User input email "agung@gmail.com" on login email field
    And User input password "mantap" on login password field
    And User click LOGIN button
    Then User see homepage

  @LoginNegative
  Scenario: User cannot login
    Given User is on test app login page
    And User input email "ngawur@gmail.com" on login email field
    And User input password "mantul" on login password field
    And User click LOGIN button
    Then User see login error message