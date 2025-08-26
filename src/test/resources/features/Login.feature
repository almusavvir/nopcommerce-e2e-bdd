Feature: Login

@sanity
Scenario: Successful Login with Valid Credentials

Given User launches Chrome browser
  When user opens URL "https://admin-demo.nopcommerce.com/login"
  And user enters Email as "admin@yourstore.com" and Password as "admin"
  And Clicks on Login
  Then Page Title should be "Dashboard / nopCommerce administration"
  When User clicks on Logout link
  Then Page Title should be "nopCommerce demo store. Login"
  And Close Browser

  @smoke
  Scenario Outline: Successful Login with Valid Credentials

    Given User launches Chrome browser
    When user opens URL "<url>"
    And user enters Email as "<email>" and Password as "<password>"
    And Clicks on Login
    Then Page Title should be "<pagetitle>"
    When User clicks on Logout link
    Then Page Title should be "<pagetitlelogout>"
    And Close Browser

    Examples:
    |url                                     |email               |password       |pagetitle                             |pagetitlelogout              |
    |https://admin-demo.nopcommerce.com/login|admin@yourstore.com |admin          |Dashboard / nopCommerce administration|nopCommerce demo store. Login|
    |https://admin-demo.nopcommerce.com/login|admin2@yourstore.com|minda@112233   |Dashboard / nopCommerce administration|nopCommerce demo store. Login|
