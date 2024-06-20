Feature: Testing Account page UI
  As a user of the website I have ensure that my profile details are displaying or not

Scenario: Testing the account heading element is displaying
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I clicked on Profile link
  Then I should be redirected to accounts page
  Then I should view the Account heading


Scenario: Testing the Membership element is displaying
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I clicked on Profile link
  Then I should be redirected to accounts page
  Then I should view the Membership element

Scenario: Testing the plan details element is displaying
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I clicked on Profile link
  Then I should be redirected to accounts page
  Then I should view the Plan details element

Scenario: Testing the Premium element is displaying
    Given I am on the Login Page
    When I entered Username and Password
    And I clicked on Login button
    Then I should be redirected to Home page
    When I clicked on Profile link
    Then I should be redirected to accounts page
    Then I should view the Premium element

Scenario: Testing ultraHD element is displaying
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I clicked on Profile link
  Then I should be redirected to accounts page
  Then I should view the UltraHD element

Scenario: Testing Logout button is displaying
  Given I am on the Login Page
  When I entered Username and Password
  And I clicked on Login button
  Then I should be redirected to Home page
  When I clicked on Profile link
  Then I should be redirected to accounts page
  Then I should view the Logout button