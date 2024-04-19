Feature: login page feature

  #Scenario: Login with valid credentials
  #
  #
    #Given user is on login page 
    #When user clicks on LandingPageLogin
    #And user clicks on login option of families
    #Then user should navigate to login page
    #When user enters username as "ramyauser@yopmail.com" into email field
    #And user enters password as "Password@123" into password field
    #And user clicks on login button 
    #Then user gets the family central page
    #And page title should be "https://www.familycentral.com"
    
    @Regression
    Scenario: Adding Calendar MileStone of Birthday
     
   Given User is already logged in to application
  |username            |password    |
  |ashokmarch12@yopmail.com|Password@123|
  
    
     When user chooses the appropriate event
     Then user clicks on next
     And user enters the name
     Then user selects the date
     And user sets the reminder
     And user entersthe description
     Then user clicks on save milestone