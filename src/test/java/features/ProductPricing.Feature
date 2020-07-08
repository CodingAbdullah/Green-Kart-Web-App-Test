Feature: Test the ability to add and remove items to the cart, update pricing

	Scenario: User correctly logged in and wants to buy products
    	Given User launches browser to the green kart url
    	And User clicks the product pricing button in the nav bar
    	Then Product Pricing page is displayed
