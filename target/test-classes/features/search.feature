Feature: Search Function

  Scenario Outline: User search item
    When user search <item>
    Then <item> will be searched
    Examples:
      | item |
      | Hummingbird |
      | mug |
      | go |
      | paper |
      | pack  |

