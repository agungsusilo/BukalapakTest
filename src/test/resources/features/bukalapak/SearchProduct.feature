@Web @SearchProduct
Feature: Search product

  Scenario: Search product on bukalapak homepage
    Given User is open bukalapak page
    When User input "headset" on search box + enter keys
    Then User see search result page
