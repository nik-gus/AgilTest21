Feature: Check Out And Pay
  Background:
    Given Guest user is on order page

  Scenario Outline: Guest User enters invalid email address
    When User inputs <invalid email> as email address
    Then Error message should be displayed
    Examples:
    | invalid email |
    | @mail.com     |
    | testmail.com |
    | test@    |
    | test@mailcom |
    | test@.com    |
    | test@mail.   |


  Scenario: Guest User neglects agree to terms
    When User submits personal information form without agreeing to terms
    Then Agree to terms error message should be displayed

