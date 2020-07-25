@Web @Register
Feature: Register new user

  Scenario: Register new User
    Given User is open bukalapak page
    When User click button Register
    And user input name "Agung" on name field
    And User input email "agungganteng@gmail.com" on register page
    And User click male gender
    And User input "agunggantengrandom" on usernamefield
    And User input "mantap123" on password field
    And User input "mantap123" on confirmation password field
    And User click on TC agreement
    And User click button daftar
    Then User is on bukalapak homepage
