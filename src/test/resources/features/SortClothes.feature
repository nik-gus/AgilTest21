# den här filen existerar bara för att det skulle gå att pusha upp foldern

  Feature:  Sort Clothes Feature

    Scenario: Sort clothes from A to Z
      Given user is on page for clothes
      When  user choose sort A-Z option for clothes
      Then the page of clothes sorted from A to Z appears

    Scenario: Sort clothes from Z to A
      Given user is on page for clothes
      When  user choose sort Z-A option for clothes
      Then the page of clothes sorted from Z to A appears

    Scenario: Sort clothes from low to high price
      Given user is on page for clothes
      When  user choose sort on low to high price option for clothes
      Then the page of clothes sorted from low to high price appears

    Scenario: Sort clothes from high to low price
      Given user is on page for clothes
      When  user choose sort on high to low price option for clothes
      Then the page of clothes sorted from high to low price appears