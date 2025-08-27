Feature: CustomerAddE2E

    @functional @e2e @customer @regression
    Scenario: Sucessful addition of new customer through admin Dashboard
     When user opens URL "https://admin-demo.nopcommerce.com/login"
     And user enters Email as "admin@yourstore.com" and Password as "admin"
     And Clicks on Login
     And User clicks on Customer hamburger menu
     And User clicks on Customer submenu item
     And User click on Add New Customer button
     And User fills out customer details
     And Clicks Submit button
     Then Added customer should reflect in customer list