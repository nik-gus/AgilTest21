# den här filen existerar bara för att det skulle gå att pusha upp foldern

  Feature:  Sort Art Feature

    Scenario: Sort art from A to Z
      Given user is on page for art products
      When  user choose sort A-Z option
      Then the page of art products sorted from A to Z appears

    Scenario: Sort art from Z to A
      Given user is on page for art products
      When  user choose sort Z-A option
      Then the page of art products sorted from Z to A appears

    Scenario: Sort art from low to high price
      Given user is on page for art products
      When  user choose sort on low to high price option
      Then the page of art products sorted from low to high price appears

    Scenario: Sort art from high to low price
      Given user is on page for art products
      When  user choose sort on high to low price option
      Then the page of art products sorted from high to low price appears