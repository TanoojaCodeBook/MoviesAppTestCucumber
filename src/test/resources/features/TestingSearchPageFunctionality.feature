Feature: As a user of the website I should  search for a movie
  then only I can watch the movie


Scenario: Testing the searching for a movie
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I click on the search button element
  Then I should be redirected to serach Page
  When I entered any Movie name
  And  I clicked on search button
  Then Movies should be displayed