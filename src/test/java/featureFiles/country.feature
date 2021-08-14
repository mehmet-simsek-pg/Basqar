Feature: Country Functionally

  Scenario: Create Country
    Given Navigate to Basqar
    When  Enter valid username and password
    Then Dashboard text should be displayed
    And Navigate to country page
    When Create a country
    Then Success massage should be displayed
