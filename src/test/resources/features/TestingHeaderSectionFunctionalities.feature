Feature: HeaderSection Functionalities

  As a user of the website,
  I want to interact with the header section effectively
  So that I can easily navigate through different sections and access important functionalities

Scenario: Navigation to the Popular Page from Home Page
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  When I clicked on the Popular link
  Then I should be redirected to Popular page

Scenario: Navigation to the Home page from the Popular page
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  When I clicked on Popular link
  When I clicked on Home link
  Then I should be redirected to Home page

Scenario: Navigation to the Acctouns page from Home Page
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  And I clicked on Profile link
  Then I should be redirected to accounts page