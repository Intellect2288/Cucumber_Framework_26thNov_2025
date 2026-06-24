#Author Laxmi
#Story - ILA-1234
@Login
Feature: Login page functionality

Background:
Given user is on login page

 @Smoke @Regression
Scenario: verify login functionality with valid username & valid password
When user enters username as ""
And user enters password as "admin123"
And user clicks on login button
Then user should be navigated to dashboard page

@Regression @Sanity
Scenario Outline: verify login functionality with allinvalid combination
When user enters username "<username>" and password "<password>"
#And user enters email id as "<email>"
Then user should not be navigated to dashboard page

Examples:
|username | password |email |
|Laxmi    | Laxmi@123|laxmi@gmail.com|
|Admin    | Laxmi@123|vivek@gmail.com|
|Laxmi    | admin123 |yash@gmail.com|






