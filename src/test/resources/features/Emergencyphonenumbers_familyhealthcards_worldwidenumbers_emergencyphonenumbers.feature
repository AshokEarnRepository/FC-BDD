Feature: Emergency prep : world wide numbers , family health cards, emergency numbers feature
  
 
 
  Scenario: Emergency prep : world wide numbers , family health cards, emergency numbers
  
 
Given User is already logged in to application
  |username            |password    |
  |ashokmarch12@yopmail.com|Password@123|
    


#Emergency prep
     When user click on emergency prep and add the folder
     
     
      #World Wide Emergency numbers
     When user clicks on the Emergency Prep
     Then user clicks on the Worldwide Emergency phone numbers
     Then user clicks on the Search option
     
     
      #Emergency prep
   When user click on emergency prepback
    
     #Family health cards
     Then user clicks on family health cards
     And user clicks on add details
     Then user enters the height
     And user enters the weight
     And user enters the blood group
     And user enters the medical conditions
     And user enters the allergies
     And user enters the medications
     Then user clicks on save
     And user edits the familyhealthcard details
     
     
       #Emergency prep
  When user click on emergency prep
    
    
      #Emergency phone numbers
     When user clicks on emergency phone numbers
     Then user clicks on add contact
     Then user enters the first name
     And user enters the last name
     Then user enters the phone number
     And user enters the email
     Then user clicks on save option
     