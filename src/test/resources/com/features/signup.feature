Feature: As a user I want to Testing SignUp page

  @signup
  Scenario: Check successfull signup
    Given I am in the automationpractice web page
    When I move to register page
    And Enter valid credentials then hit submit
    Then user should register successfully 
  