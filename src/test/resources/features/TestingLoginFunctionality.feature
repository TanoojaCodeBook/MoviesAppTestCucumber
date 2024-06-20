Feature: Login Functionality
  As a registered user I want able to login into my account
  so that I can watch movies



Scenario: Login Functionality with valid credentials
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page