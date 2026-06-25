Feature: Dashboard page functionality

Scenario: Verify title of the dashboard page
When user login with username "Admin" and password "admin123"
Then user should see dashboard title as "OrangeHRM"

Scenario: Verify url of the dashboard page
When user login with username "Admin" and password "admin123"
Then user should see dashboard url as "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"

  Scenario: Verify claim button is displayed on Dashboard page
    When user login with username "Admin" and password "admin123"
    Then user should see claims button