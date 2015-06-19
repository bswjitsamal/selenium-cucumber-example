Feature: Testing for login page

  @Smoke
  Scenario: Check login page
    Given I am in the home page
    When I click on login link
    Then I should in login page

  @Smoke
  Scenario: Check successfull login page
    Given I am in the login page
    When I enter valid credentials
    Then I see the dashboard page
