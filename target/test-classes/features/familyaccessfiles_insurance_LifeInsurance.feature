
Feature: Life insurance Folder


@Regression
 Scenario: Life Insurance file uploading
 
 Given User is already logged in to application
  |username            |password    |
  |ashokmarch12@yopmail.com|Password@123|
    
  
     #Family Access Files
     Given User navigates to the Family Access Files section
    #When User clicks on IDs
    #And User selects the subscriber
  
     #Insurance
     When user clicks on Insurance
     And User selects the subscriber
     And click on the life insurance
    
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
  