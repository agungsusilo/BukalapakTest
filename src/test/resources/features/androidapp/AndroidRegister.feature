@Android @Register
Feature: Register new User

  @RegisterPositive
  Scenario: Successfully register new user
    Given User is on test app page
    When User click register button
    And User
