Feature: Legacy messages page feature
  
 
 
  Scenario: Login with valid credentials
  
   
Given User is already logged in to application
  |username            |password    |
  |ashokmarch12@yopmail.com|Password@123|
    
     
      #Legacy messages
     Given the user is on the Legacy Messages page
     When the user extracts OTP from smstome
     When the user clicks on Create your first message 
     When the user clicks on Next button
     When the user clicks on otherindividuals
     When these user clicks on Next button
    
 
    
    
    
    
    Then user clicks on 3 dots option
    And user edits the title
    And user adds the family member in legacy
    Then user adds the other individuals 
     
   
   
   When user navigates to the yopmail
   Then user enters the email in yopmail
   And user clicks on the enter 
   Then user clicks on shared link
   And user enters the otp
  
   And again navigates to the family central
   
   
   
    Then user deletes the legacy video
    
    
    
    
    
    