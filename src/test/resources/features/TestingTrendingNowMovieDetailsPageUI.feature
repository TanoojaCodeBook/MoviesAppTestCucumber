Feature: As a user of the website I have to ensure that all the details of the
         movies like movie title and watch time and release date are displaying

Scenario: Testing the movie name is displaying
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I click on first Trending now movie
  Then I should be redirected to Movie Details page
  Then I should view the  movie name element


Scenario: Testing the movie watch time is displaying
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I click on first Trending now movie
  Then I should be redirected to Movie Details page
  Then I should view the  watch time element

Scenario: Testing the sensor rating is displaying
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I click on first Trending now movie
  Then I should be redirected to Movie Details page
  Then I should view the sensor rating element

Scenario: Testing the release year is displaying
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I click on first Trending now movie
  Then I should be redirected to Movie Details page
  Then I should view the release year element

Scenario: Testing the movie overview is displaying
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I click on first Trending now movie
  Then I should be redirected to Movie Details page
  Then I should view the movie overview element

Scenario: Testing the play button is displaying
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I click on first Trending now movie
  Then I should be redirected to Movie Details page
  Then I should view the play button
