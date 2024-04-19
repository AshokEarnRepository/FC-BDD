Feature: Files Driving License Upload Feature


@Regression
  Scenario: Uploading Driving License in IDs Folder
  
  
Given User is already logged in to application
  |username            |password    |
  |ashokmarch12@yopmail.com|Password@123|
    
     
     Given the User clicks on Family Access Files
  
  
     When User clicks on IDs
     And User selects the subscriber
     And user clicks on the Driving license
    
     And User clicks on the Add button
    And User selects the Scan option
    And User uploads the Birth Certificate file into the Birth folder
    And User Clicks on Done Option
    Then User should see the success toast message
    And User Clicks On the Save Option On PopUp