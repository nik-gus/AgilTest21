Feature:  Sort Art Feature

  Background:
    Given user is on page for art products

  Scenario Outline:
    When user choose sort by <sort by>
    Then the products on art page is sorted by <sort by>
    Examples:
      | sort by |
      | Name, A to Z  |
      | Name, Z to A  |
      | Price, low to high  |
      | Price, high to low  |
