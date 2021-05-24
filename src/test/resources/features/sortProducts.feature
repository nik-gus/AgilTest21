Feature:  Sort Products

  Scenario Outline:
    Given user is on page <page>
    When user choose sort by <sort by>
    Then the products is sorted by <sort by>
    Examples:
      | page | sort by |
      | CLOTHES | Name, A to Z  |
      | CLOTHES | Name, Z to A  |
      | CLOTHES | Price, low to high  |
      | CLOTHES | Price, high to low  |
      | ACCESSORIES | Name, A to Z  |
      | ACCESSORIES | Name, Z to A  |
      | ACCESSORIES | Price, low to high  |
      | ACCESSORIES | Price, high to low  |
      | ART | Name, A to Z  |
      | ART | Name, Z to A  |
      | ART | Price, low to high  |
      | ART | Price, high to low  |

