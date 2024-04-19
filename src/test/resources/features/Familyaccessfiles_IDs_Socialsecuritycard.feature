Feature: Files Social security cards Upload Feature


  @Regression
  Scenario: Verify Uploading Social security cards in IDs Folder
  
  
Given User is already logged in to application
  |username            |password    |
  |ashokmarch12@yopmail.com|Password@123|
    
    Given user navigates to the Family Access Files section
  
   When User clicks on IDs
    And User selects the subscriber
    When user clicks on the SocialsecuirityCard
    
    And User clicks on the Add button
    And User selects the Scan option
    And User uploads the Birth Certificate file into the Birth folder
    And User Clicks on Done Option
    Then User should see the success toast message
    And User Clicks On the Save Option On PopUp
  