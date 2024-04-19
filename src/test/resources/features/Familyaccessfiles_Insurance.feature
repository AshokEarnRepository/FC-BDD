
Feature: Files Insurance Folder File upload


@Regression
 Scenario: Uploading Files into Insurance Folder
  
      Given User is already logged in to application
  |username            |password    |
  |ashokmarch12@yopmail.com|Password@123|
  
  
     #Family Access Files
     Given user navigates to the Family Access Files section
  
     #Insurance
     When user clicks on Insurance
     And User selects the subscriber
     When user clicks on add folder
     Then user enters the folder name
     And user clicks on add
     Then user clicks on close
     #Then user clicks on the Insurance new folder
    
     And User clicks the added folderFiles
    
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
  