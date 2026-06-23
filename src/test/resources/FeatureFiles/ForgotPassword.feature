@Regression
Feature: Forgot Password Functionality

@Smoke
  Scenario: Reset Password with Valid Email
    Given User is on Forgot Password Page
    When User enters email "laxmi@gmail.com"
    And User clicks on Send Reset Link button
    Then Password reset link should be sent

@Sanity
  Scenario: Reset Password with Invalid Email
    Given User is on Forgot Password Page
    When User enters email "laxmi123@gmail.com"
    And User clicks on Send Reset Link button
  And User clicks on Send Reset Link button
