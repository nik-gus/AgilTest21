Feature: Correct user

  Scenario: Correct user is created

    Given User is on homepage
    When User input valid information
    Then User should be logged in