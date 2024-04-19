@feature
Feature: Upload Passport from IDs Section


@Regression
 Scenario: Upload Different Passport Files into Passport folder 
 
  Given User is already logged in to application
  |username            |password    |
  |ashokmarch12@yopmail.com|Password@123|

    Given User navigates to the Family Access Files section
    When User clicks on IDs
    And User selects the subscriber
    And User selects the passport folder
    And User clicks on the Add button
    And User selects the Scan option
    And User uploads the Passport file into the Passport folder
    And User Clicks on Done Option
    Then User should see the success toast message
    And User Clicks On the Save Option On PopUp
    #And User Click On the Three Dots Option of File Uploaded
    #And User Click on the View File
    #Then User Close the PopUp Window
    #And Click on User breadCrum Option
    #And User selects the passport folder
    @Regression
     Scenario: Upload Different Passport2 Files into Passport folder 
    And User clicks on the Add button
    And User selects the Scan option
    And User uploads the Passport2 file into the Passport folder
    And User Clicks on Done Option
    Then User should see the success toast message
    And User Clicks On the Save Option On PopUp
    
    
    @Regression
     Scenario: Upload Different Passport3 Files into Passport folder 
     
    And User clicks on the Add button
    And User selects the Scan option
    And User uploads the Passport3 file into the Passport folder
    And User Clicks on Done Option
    Then User should see the success toast message
    And User Clicks On the Save Option On PopUp
    
    
    @Regression
    Scenario: Upload Different Passport5 Files into Passport folder 
    
    And User clicks on the Add button
    And User selects the Scan option
    And User uploads the Passport5 file into the Passport folder
    And User Clicks on Done Option
    Then User should see the success toast message
    And User Clicks On the Save Option On PopUp
    
    #And Click on User breadCrum Option
    #And User selects the passport folder
    
    @Regression
     Scenario: Upload Different Passport6 Files into Passport folder 
     
    And User clicks on the Add button
    And User selects the Scan option
    And User uploads the Passport6 file into the Passport folder
    And User Clicks on Done Option
    Then User should see the success toast message
    And User Clicks On the Save Option On PopUp
