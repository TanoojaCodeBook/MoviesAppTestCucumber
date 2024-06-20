Feature: As a user of the website I should logout from the website
  then only I can login whenever I want


Scenario: Testing the Logout Functionality
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I clicked on Profile link
  Then I should be redirected to accounts page
  When I clicked on the Logout button
  Then I should be redirected to Login Page