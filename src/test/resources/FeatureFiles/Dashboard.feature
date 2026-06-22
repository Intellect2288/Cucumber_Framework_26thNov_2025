Feature: Dashboard page functionality

Scenario: Verify title of the dashboard page
When user login with username "Admin" and password "admin123"
Then user should see dashboard title as "OrangeHRM"

Scenario: Verify url of the dashboard page
When user login with username "Admin" and password "admin123"
Then user should see dashboard url as "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"

  Scenario :verify claim button is displayed
    When user user login with username "Admin" and password "admin123"
    Then user should see "claim" button

  Scenario :verify claim page is getting opened
    When user user login with username "Admin" and password "admin123"
    Then user should be navigated to dashboard page
    Then user should see "claim" button
    When user clicks on claim button
    And user should see this url "https://opensource-demo.orangehrmlive.com/web/index.php/claim/viewAssignClaim"

