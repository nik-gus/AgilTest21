Feature: Sort Accessories
  Scenario: User sorts Accessories by name AtoZ
    Given : User is on Accessories page
    When  : User chooses to sort products by A To Z
    Then Success message is displayed When A TO Z is verified

    Scenario: User sorts Accessories by name Z to A
      Given : User is on Accessories page
      When  : User chooses to sort products by Z To A
      Then Success message is displayed When Z TO A is verified


  Scenario: User sorts Accessories by price Low To High
    Given : User is on Accessories page
    When  : User chooses to sort products by Low To High
    Then Success message is displayed When Low To High is verified

  Scenario: User sorts Accessories by name High To Low
    Given : User is on Accessories page
    When  : User chooses to sort products by High To Low
    Then Success message is displayed When High To Low is verified


