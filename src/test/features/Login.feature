Feature: Login

Scenario: Successful Login with Valid Credentials

Given User launches Chrome browser
  When user opens URL "https://admin-demo.nopcommerce.com/login"
  And user enters Email as "admin@yourstore.com" and Password as "admin"
  And Clicks on Login
  Then Page Title should be "Dashboard / nopCommerce administration"
  When User clicks on Logout link
  Then Page Title should be "nopCommerce demo store. Login"
  And Close Browser