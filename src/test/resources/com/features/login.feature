Feature: Testing for login page

  @login
  Scenario: Check successfull login page
    Given I am in the login page
    When I enter valid credentials
    Then I see the dashboard page
