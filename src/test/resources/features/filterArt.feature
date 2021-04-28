Feature: Filter Art Products

  Background:
    Given page Art is open

  Scenario Outline: User filters Art products by a single filter
    When user filters product by <filter>
    Then products will be filtered by <filter>

    Examples:
    | filter |
    | Matt paper |
    | Graphic Corner |
    | 40x60cm        |
    | 60x90cm        |
    | 80x120cm       |

# TODO: User filters Art products by combined filters