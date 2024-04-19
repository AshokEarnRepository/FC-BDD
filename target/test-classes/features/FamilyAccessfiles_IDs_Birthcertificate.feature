Feature: Files Birthday Certificate Upload Feature

  @Regression
  Scenario: Uploading Birthday Certificate in IDs Folder
  
  
Given User is already logged in to application
  |username            |password    |
  |ashokmarch12@yopmail.com|Password@123|
    
  
  
     #Family Access Files
     Given the User clicks on Family Access Files
  
  
     When User clicks on IDs
     And User selects the subscriber
     And clicks on the Birth certificate
    
     And User clicks on the Add button
    And User selects the Scan option
    And User uploads the Birth Certificate file into the Birth folder
    And User Clicks on Done Option
    Then User should see the success toast message
    And User Clicks On the Save Option On PopUp