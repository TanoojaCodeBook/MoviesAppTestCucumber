Feature:Testing the UI elements of Login Page
  As a user
  I want to interact with UI elements on the LoginPage
  So that I can perform actions and see the expected results


Scenario: Checking the website logo is displaying
  Given I am on the Login Page
  Then I should see the website logo displayed

Scenario: Testing the Heading text is "Login"
  Given I am on the Login Page
  Then the heading should display the text "Login"


Scenario: Testing the Username label text is "USERNAME"

  Given I am on the Login Page
  Then the Username label text should be "USERNAME"


Scenario: Testing the Password label text is "PASSWORD"
    Given I am on the Login Page
    Then the Password label text should be "PASSWORD"

Scenario: Testing the Login Button is diplaying
  Given I am on the Login Page
  Then the Login button should be displayed
