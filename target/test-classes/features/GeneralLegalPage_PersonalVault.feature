#@feature
Feature: PersonalVault General Legal Information of Uploading Different file types
  
  
  #Background: 
  
   @tag0 @Regression
   Scenario: General Legal upload PNG file upload
   
   Given User is already logged in to application
  |username            |password    |
  |ashokmarch12@yopmail.com|Password@123|
    
   When User clicks on personal vault
   And User navigates to smstome website

  #General Legal Information
  When user clicks on general legal information
  And user clicks on add option
  And user clicks on upload file
  Then User should see the "File Uploaded Successfully" Message
  
  
  @tag1
  @Regression
Scenario: General Legal upload PDF file upload
  Given User clicks on personal vault
  #And User navigates to smstome website
  #When user clicks on general legal information
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
 
 
  @tag2 @Regression
 Scenario: General Legal upload JPG file upload
  Given User clicks on personal vault
  #And User navigates to smstome website
  #When user clicks on general legal information
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
  @tag3 @Regression
 Scenario: General Legal upload XLSX file upload
  Given User clicks on personal vault
  #And User navigates to smstome website
  #When user clicks on general legal information
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
  
  @Regression
Scenario: General Legal upload JPEG file upload
  Given User clicks on personal vault
  #And User navigates to smstome website
  #When user clicks on general legal information
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
  @Regression
    Scenario: General Legal upload TXT file upload
    Given User clicks on personal vault
   #And User navigates to smstome website
  #When user clicks on general legal information
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  