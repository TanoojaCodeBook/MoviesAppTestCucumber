Feature: Testing the Home Page
  As a user
  I want to ensure that all essential elements are present in the Home page

Scenario: Testing the Heading text of each Section
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  Then Heading text of each section should be "Trending Now" and "Originals"


Scenario: Testing Play button is displaying
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  Then Play button should be displayed

Scenario: Testing movies are displaying in the corresponding order
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  Then Trending Now movies and Orginials movies should be displayed and it's count should be 10

Scenario: Testing Contact us section
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  And I should be redirected to Home page
  Then The text of Contact us section should be "Contact Us"