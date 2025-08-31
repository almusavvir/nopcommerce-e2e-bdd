@wip
Feature: CustomerAddE2E

    Backgroud:
     Given User launches Chrome browser
     When user opens URL "https://admin-demo.nopcommerce.com/login"
     And user enters Email as "admin@yourstore.com" and Password as "admin"
     And Clicks on Login
     And User clicks on Customer hamburger menu
     And User clicks on Customer submenu item

    @functional @e2e @regression
    Scenario: Successful addition of new customer through admin Dashboard
     And User click on Add New Customer button
     And User fills out customer details
     And Clicks Submit button
     Then Added customer should reflect in customer list

    @functional @regression @wip
    Scenario: Successful addition of new customer through admin Dashboard with Save and Edit option
     And User click on Add New Customer button
     And User fills out customer details
     And Clicks Submit and Edit button