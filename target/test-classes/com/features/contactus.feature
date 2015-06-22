Feature: Testing for contactus page

Scenario Outline: contactus page
  Given I am in the contactus page
  When I enter "<subjectheading>" form dropdown
  And I enter "<email>" in email field
  And I enter "<orderreferance>" in order field
  And I enter "<message>" in text area
  And I click on send
  Then I should a success message

  Examples:
    | subjectheading   | email   | orderreferance  | message      |
    | Customer service | t@t.com |  12345          |  Hello World |
    | Webmaster        | t@t.com |  67890          |  Hello Ruby  |
  

