Feature: Search Function

  Scenario Outline: User search item
    Given user is on homepage
    When user search <item>
    Then <item> will be searched with <result>
    Examples:
      | item          | result    |
      | Hummingbird   | There     |
      | mug           | There     |
      | go            | Sorry     |
      | paper         | There     |
      | pack          | There     |

