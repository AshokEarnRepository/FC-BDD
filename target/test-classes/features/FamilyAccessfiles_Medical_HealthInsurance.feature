
Feature: login page feature



@Regression
  Scenario: FamilyAccessfiles_Medical_HealthInsurance
  
  
Given User is already logged in to application
  |username            |password    |
  |ashokmarch12@yopmail.com|Password@123|


 #Medical
    Given user navigates to the Family Access Files section
    Then user clicks on medical
    And User selects the subscriber
    
  #Healthinsurance
    And user clicks on Health insurance
   
    
      #file1
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
  
  
  #file2
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
  
 #file3
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
 #file4
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
#file5
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
 
    
    