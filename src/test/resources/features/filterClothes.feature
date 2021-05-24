Feature: Filter feature on Prestashop´s Clothes page

@testing
Scenario: Filter Clothes products by three filter options
  Given user is on Clothes page
  When user filter by Men
  And user filter by sizes M and L
  Then products displayed are filtered by all three filter options

  @testing
  Scenario: Filter Clothes by category man
    Given user is on Clothes page
    When user filter by category Men
    Then products displayed are filtered by men

    @testing
    Scenario: Filter Clothes by category woman
      Given user is on Clothes page
      When user filter by category woman
      Then products displayed are filtered by woman

