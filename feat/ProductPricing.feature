Feature: Test the ability to add and remove items to the cart, update pricing

	Scenario: User correctly logged in and wants to buy products
    	Given User launches browser to the green kart url
    	And User clicks the product pricing button in the nav bar
    	When Product Pricing page is displayed
    	And User clicks some random vegetables with random quantity to add
    	Then The cost dashboard should update
    	
    Scenario: User correctly logged in and wants to buy products and remove some items
    	Given User launches browser to the green kart url
    	And User clicks the product pricing button in the nav bar
    	When Product Pricing page is displayed
    	And User clicks some random vegetables with random quantity to add
    	And User clicks randomly added vegetables with random quantity to remove
    	Then The cost dashboard should update
    
    Scenario: User correctly logged in and wants to buy products and reset some item quantity
    	Given User launches browser to the green kart url
    	And User clicks the product pricing button in the nav bar
    	When Product Pricing page is displayed
    	And User clicks some random vegetables with random quantity to add
    	And User clicks randomly added vegetables to reset quantity
    	Then The cost dashboard should update
    	
    Scenario: User correctly logged in and wants to buy products, remove, and reset some items
    	Given User launches browser to the green kart url
    	And User clicks the product pricing page in the nav bar
    	When Product pricing page is displayed
    	And User clicks some random vegetables with random quantity to add
    	And User clicks randomly added vegetables to remove with random quantity
    	And User clicks randomly added vegetables to reset quantity
    	Then The cost dashboard should update
