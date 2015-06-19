Feature: As a user I want to Testing SignUp page

  @signup
  Scenario: Check successfull signup
    Given I am in the ThinkHr web page
    When I click on SignUp button
    And Enter valid credentials then hit submit
    Then I see the success page
  