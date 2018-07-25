@RM
Feature: search for a property

  Scenario: verify that the incremental search results relate to the typed in text
    Given I am on the dashboard page
    When I enter "London" into the search location box
    Then all the incremental search results should start with the word "London"


    Scenario: verify that the choose your location filter only appears when the location is searched not via clicking the incremental search results
      Given I am on the dashboard page
      When I enter "London" into the search box location and click search with out choosing any of the incremental search result
      Then I should be able to find the "Choose your location" filter
      And If I were to perform the same action by clicking the incremental search result for "London"
      Then I should be shown "Search radius" filter only

  Scenario: apply filters and find a suitable property
      Given I have searched for properties in "London" area and I have been navigated to the filters page
      When I apply filters and proceed on with clicking find properties
      Then I should be provided with the result list
      And I should be able to sort the property by "Newest Listed"
      And choose the first non featured property from the displayed result