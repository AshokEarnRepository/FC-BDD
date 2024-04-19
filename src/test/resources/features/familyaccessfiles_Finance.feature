
Feature: Files Finance folder functionality

 @Regression
 Scenario: Invoice upload into Finance section or Folder
  
  Given User is already logged in to application
  |username            |password    |
  |ashokmarch12@yopmail.com|Password@123|
    
     #Family Access Files
     Given user navigates to the Family Access Files section
     
     #Finance
     When user clicks on the Finance
     And User selects the subscriber
     And user clicks on the invoice
     And User clicks on the Add button
    And User selects the Scan option
    And User uploads the Invoice file into the Invoice folder
    And User Clicks on Done Option
    Then User should see the success toast message
    And User Clicks On the Save Option On PopUp