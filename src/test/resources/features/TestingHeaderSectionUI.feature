Feature: As a user
  I want to ensure that all essential elements are present in the Home page Nav bar section
  then only I can navigate to other pages

Scenario: Testing the Website logo is displayed
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  Then Website Logo should be displayed

Scenario: Testing the Home Link is displayed
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  Then The link Home should be displayed

Scenario: Testing the Popular links is displayed
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  Then The link Popular should be displayed

Scenario: Testing the Search button link is displayed
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  Then The link Search button should be displayed

Scenario: Testing the Profile link is displayed
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  Then The Link Profile should be displayed

Scenario: Testing the text of Home
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  Then The text of Home element should be "Home"

Scenario: Testing the text of Popular
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  Then The text of Popular element should be "Popular"

