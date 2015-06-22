$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contactus.feature");
formatter.feature({
  "line": 1,
  "name": "Testing for contactus page",
  "description": "",
  "id": "testing-for-contactus-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "contactus page",
  "description": "",
  "id": "testing-for-contactus-page;contactus-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@contactus"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am in the contactus page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"\u003csubjectheading\u003e\" form dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter \"\u003cemail\u003e\" in email field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"\u003corderreferance\u003e\" in order field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"\u003cmessage\u003e\" in text area",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on send",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should a success message",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "testing-for-contactus-page;contactus-page;",
  "rows": [
    {
      "cells": [
        "subjectheading",
        "email",
        "orderreferance",
        "message"
      ],
      "line": 14,
      "id": "testing-for-contactus-page;contactus-page;;1"
    },
    {
      "cells": [
        "Customer service",
        "t@t.com",
        "12345",
        "Hello World"
      ],
      "line": 15,
      "id": "testing-for-contactus-page;contactus-page;;2"
    },
    {
      "cells": [
        "Webmaster",
        "t@t.com",
        "67890",
        "Hello Ruby"
      ],
      "line": 16,
      "id": "testing-for-contactus-page;contactus-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "contactus page",
  "description": "",
  "id": "testing-for-contactus-page;contactus-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@contactus"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am in the contactus page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"Customer service\" form dropdown",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter \"t@t.com\" in email field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"12345\" in order field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"Hello World\" in text area",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on send",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should a success message",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsStepDef.i_am_in_the_contactus_page()"
});
formatter.result({
  "duration": 11818707910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer service",
      "offset": 9
    }
  ],
  "location": "ContactUsStepDef.i_enter_form_dropdown(String)"
});
formatter.result({
  "duration": 2491561855,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "t@t.com",
      "offset": 9
    }
  ],
  "location": "ContactUsStepDef.i_enter_in_email_field(String)"
});
formatter.result({
  "duration": 131505476,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 9
    }
  ],
  "location": "ContactUsStepDef.i_enter_in_order_field(String)"
});
formatter.result({
  "duration": 85978047,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello World",
      "offset": 9
    }
  ],
  "location": "ContactUsStepDef.i_enter_in_text_area(String)"
});
formatter.result({
  "duration": 596289207,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsStepDef.i_click_on_send()"
});
formatter.result({
  "duration": 1315426970,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsStepDef.i_should_a_success_message()"
});
formatter.result({
  "duration": 39342,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "contactus page",
  "description": "",
  "id": "testing-for-contactus-page;contactus-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@contactus"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am in the contactus page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"Webmaster\" form dropdown",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter \"t@t.com\" in email field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"67890\" in order field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"Hello Ruby\" in text area",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on send",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should a success message",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsStepDef.i_am_in_the_contactus_page()"
});
formatter.result({
  "duration": 2287453196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Webmaster",
      "offset": 9
    }
  ],
  "location": "ContactUsStepDef.i_enter_form_dropdown(String)"
});
formatter.result({
  "duration": 1860955597,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "t@t.com",
      "offset": 9
    }
  ],
  "location": "ContactUsStepDef.i_enter_in_email_field(String)"
});
formatter.result({
  "duration": 113375378,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "67890",
      "offset": 9
    }
  ],
  "location": "ContactUsStepDef.i_enter_in_order_field(String)"
});
formatter.result({
  "duration": 92455770,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello Ruby",
      "offset": 9
    }
  ],
  "location": "ContactUsStepDef.i_enter_in_text_area(String)"
});
formatter.result({
  "duration": 135497136,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsStepDef.i_click_on_send()"
});
formatter.result({
  "duration": 1862944243,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsStepDef.i_should_a_success_message()"
});
formatter.result({
  "duration": 33184,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Testing for login page",
  "description": "",
  "id": "testing-for-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Check successfull login page",
  "description": "",
  "id": "testing-for-login-page;check-successfull-login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see the dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.i_am_in_the_login_page()"
});
formatter.result({
  "duration": 1858753821,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_enter_valid_credentials()"
});
formatter.result({
  "duration": 4980527489,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_see_the_dashboard_page()"
});
formatter.result({
  "duration": 43105,
  "status": "passed"
});
formatter.uri("signup.feature");
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
  "duration": 1861096543,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDef.i_move_to_register_page()"
});
formatter.result({
  "duration": 18740433343,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDef.enter_valid_credentials_then_hit_submit()"
});
formatter.result({
  "duration": 49605,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDef.user_should_register_successfully()"
});
formatter.result({
  "duration": 38316,
  "status": "passed"
});
});