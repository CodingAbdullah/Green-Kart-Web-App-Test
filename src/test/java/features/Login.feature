Feature: Verify if user is able to login in to the green kart website

  Scenario: Login as a authenticated user
    Given User launches browser to the green kart url
    When User clicks login button in the navbar, display login page
    And User enters valid username
    And User enters valid password
    Then Success message is displayed along with product pricing page
