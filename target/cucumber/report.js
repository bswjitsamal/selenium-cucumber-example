$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signup.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want to Testing SignUp page",
  "description": "",
  "id": "as-a-user-i-want-to-testing-signup-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Check successfull signup",
  "description": "",
  "id": "as-a-user-i-want-to-testing-signup-page;check-successfull-signup",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@signup"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am in the automationpractice web page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I move to register page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter valid credentials then hit submit",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDef.i_am_in_the_automationpractice_web_page()"
});
formatter.result({
  "duration": 13077848992,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDef.i_move_to_register_page()"
});
formatter.result({
  "duration": 19336409525,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDef.enter_valid_credentials_then_hit_submit()"
});
formatter.result({
  "duration": 30447,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDef.user_should_register_successfully()"
});
formatter.result({
  "duration": 27026,
  "status": "passed"
});
});