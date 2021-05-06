Feature: Filter Art Products

  Background:
    Given page Art is open

  Scenario Outline: User filters Art products by a single filter
    When user filters products by a single filter <filter>
    Then products displayed is filtered by a single filter <filter>
    Examples:
    | filter |
    | Matt paper |
    | Graphic Corner |
    | 40x60cm        |
    | 60x90cm        |
    | 80x120cm       |

  Scenario Outline: User filter Art products by two filters combined
    When user combines the two filters <filter1> and <filter2>
    Then displayed products is filtered by <filter1> and <filter2>
    Examples:
    | filter1 | filter2 |
    | Matt paper | 40x60 |
    | Graphic Corner | 40x60 |
    | Matt paper     | 60x90 |
    | Graphic Corner | 60x90 |
    | Matt paper     | 80x120 |
    | Graphic Corner | 80x120 |
