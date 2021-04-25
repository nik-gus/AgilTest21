Feature: Check Out And Pay

  Scenario: Guest User enters invalid email address
    Given Guest user is on order page
    When User inputs invalid email address
    Then Error message should be displayed