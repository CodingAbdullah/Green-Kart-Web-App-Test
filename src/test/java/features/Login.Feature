Feature: Login Feature
  Verify if user is able to login in to the green kart website

  Scenario: Login as a authenticated user
    Given User launches browser to the green kart url
    When User clicks login button in the navbar, display login page
    And User enters valid username
    And User enters valid password
    Then Success message is displayed along with product pricing page
    
  Scenario: Login as invalid user with wrong username
  	Given User launches browser to the green kart url
  	When User clicks login button in the navbar, display login page
  	And User enters invalid username
  	And User enters valid password
  	Then Error message is displayed and redirected to login page
  	
  Scenario: Login as invalid user with wrong password
  	Given User launches browser to the green kart url
  	When User clicks login button in the navbar, display login page
  	And User enters valid username
  	And User enters invalid password
  	Then Error message is displayed and redirected to login page
  	
  Scenario: Login as invalid user with wrong username and password
  	Given User launches browser to the green kart url
  	When User clicks login button in the navbar, display login page
  	And User enters invalid username
  	And User enters invalid password
  	Then Error message is displayed and redirected to login page
  
  Scenario: Login as blank username
  	Given User launches browser to the green kart url
  	When User clicks login button in the navbar, display login page
  	And User enters blank username
  	And User enters password
  	Then Error message is displayed to enter username and redirected to login page
  	
  Scenario: Login as blank password
  	Given User launches browser to the green kart url
  	When User clicks login button in the navbar, display login page
  	And User enters username
  	And User enters blank password
  	Then Error message is displayed to enter password and redirected to login page
  	
  Scenario: Login in as nothing
  	Given User launches browser to the green kart url
  	When User clicks login button in the navbar, display login page
  	Then User clicks submit and error message is displayed to enter creds and redirected to login page
