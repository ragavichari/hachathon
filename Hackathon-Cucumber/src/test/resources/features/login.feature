@TC001
Feature: LMS loginpage
  
  Background: Validating the url
   Given User is on the browser 
    When User opens the LMS Website URL "https://lms-frontend-phase2.herokuapp.com/login"
    Then User should see the Login page.
   Scenario Outline: user opens login page
   #When user clicks the login page without entering Username and Password
  #Then It should display the error message Invalid username and password Please try again
  #When user fills the username as "<username>" and not password
    #Then user clicks the login button it should display error message
   # When user fills the password  as "<password>" and not username 
    #Then user clicks the login button it should display error message Invalid username and password Please try again
    When User clicks the Login button after entering valid username as "<username>" and password as "<password>"
    Then user clicks the login button 
    Then User should see the LMS Home page
   
   Examples: 
      | username  | password             |status|
      | Ragavi    |                      | Fail |
      |           |  Password@123        | Fail |
      |           |                      | Fail |
      |Ragavi     | Password123!         | Pass |