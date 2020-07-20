Feature: To test if user can properly sign up in the green kart application

	Scenario: Test a valid sign up with green kart
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters valid first name
		And User enters valid last nane
		And User enters valid age
		And User enters valid email
		And User enters valid password
		And User enters valid address
		And User enters valid gender
		Then User clicks sign up button and success message displayed, redirected to product pricing page

	Scenario: Test sign up with invalid first name
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters invalid first name
		And User enters valid last name
		And User enters valid age
		And User enters valid email
		And User enters valid password
		And User enters valid address
		And User enters valid gender
		Then User clicks sign up button and error message displayed, redirected to sign up page
	
	Scenario: Test sign up with invalid last name
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters valid first name
		And User enters invalid last name
		And User enters valid age
		And User enters valid email
		And User enters valid password
		And User enters valid address
		And User enters valid gender
		Then User clicks sign up button and error message displayed, redirected to sign up page
		
	Scenario: Test sign up with invalid age
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters valid first name
		And User enters valid last name
		And User enters invalid age
		And User enters valid email
		And User enters valid password
		And User enters valid address
		And User enters valid gender
		Then User clicks sign up button and error message displayed, redirected to sign up page 
		
	Scenario: Test sign up with invalid email
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters valid first name
		And User enters valid last name
		And User enters valid age
		And User enters invalid email
		And User enters valid password
		And User enters valid address
		And User enters valid gender
		Then User clicks sign up button and error message displayed, redirected to sign up page
	
	Scenario: Test sign up with invalid password
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters valid first name
		And User enters valid last name
		And User enters valid age
		And User enters valid email
		And User enters invalid password
		And User enters valid address
		And User enters valid gender
		Then User clicks sign up button and error message displayed, redirected to sign up page

	Scenario: Test sign up with invalid address
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters valid first name
		And User enters valid last name
		And User enters valid age
		And User enters valid email
		And User enters valid password
		And User enters invalid address
		And User enters valid gender
		Then User clicks sign up button and error message displayed, redirected to sign up page
	
	Scenario: Test sign up with invalid gender
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters valid first name
		And User enters valid last name
		And User enters valid age
		And User enters valid email
		And User enters valid password
		And User enters valid address
		And User enters invalid gender
		Then User clicks sign up button and error message displayed, redirected to the sign up page

	Scenario: Test sign up with blank first name
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters blank first name
		And User enters last name
		And User enters age
		And User enters email
		And User enters password
		And User enters address
		And User enters gender
		Then User clicks sign up button and error message displayed, redirected to the sign up page
	
	Scenario: Test sign up with blank last name
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters first name
		And User enters blank last name
		And User enters age
		And User enters email
		And User enters password
		And User enters address
		And User enters gender
		Then User clicks sign up button and error message displayed, redirected to the sign up page
	
	Scenario: Test sign up with blank age
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters first name
		And User enters last name
		And User enters blank age
		And User enters email
		And User enters password
		And User enters address
		And User enters gender
		Then User clicks sign up button and error message displayed, redirected to the sign up page
	
	Scenario: Test sign up with blank email
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters first name
		And User enters last name
		And User enters age
		And User enters blank email
		And User enters password
		And User enters address
		And User enters gender
		Then User clicks sign up button and error message displayed, redirected to the sign up page
		
	Scenario: Test sign up with blank password
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters first name
		And User enters last name
		And User enters age
		And User enters email
		And User enters blank password
		And User enters address
		And User enters gender
		Then User clicks sign up button and error message displayed, redirected to the sign up page
	
	Scenario: Test sign up with blank address
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		And User enters first name
		And User enters last name
		And User enters age
		And User enters email
		And User enters password
		And User enters blank address
		And User enters gender
		Then User clicks sign up button and error message displayed, redirected to the sign up page
		
	Scenario: Test sign up with nothing
		Given User launches browser to the green kart url
		When User clicks the sign up button in the nav bar, sign up page is displayed
		Then User clicks sign up button and error message displayed, redirected to the sign up page