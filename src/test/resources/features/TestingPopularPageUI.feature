Feature: Testing the Popular Page
  As a user of the website I have to ensure that all movies should be displayed
  then only I can play and watch the movies



Scenario:  Testing the movies are displaying
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I clicked on the Popular link
  Then I will be redirected to Popular page
  Then Popular movies should be displayed