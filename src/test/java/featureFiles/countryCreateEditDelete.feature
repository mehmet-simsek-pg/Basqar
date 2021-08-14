Feature: Country Create Edit Delete Functionality

  Background:
    Given Navigate to Basqar
    When  Enter valid username and password
    Then Dashboard text should be displayed
    And Navigate to country page


  Scenario: Create a country

    When Create a country name as "My Country" code as "MC"
    Then Success massage should be displayed

  Scenario: Edit a country

    When User edit the "My Country" to "New Country"
    Then Success massage should be displayed

  Scenario: Delete a country

    When User delete the "New Country"
    Then Success massage should be displayed