Feature: User Registration

  Scenario: Successful Registration
    Given User is on Registration Page
    When User enters first name "Laxmi"
    And User enters last name "Maurya"
    And User enters email "laxmi@gmail.com"
    And User clicks on Register button
    Then Registration should be successful