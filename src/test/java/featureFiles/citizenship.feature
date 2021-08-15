Feature: Citizenship with scenario outline

  Background:
    Given Navigate to Basqar
    When  Enter valid username and password
    Then Dashboard text should be displayed
    And Navigate to citizenship page

  Scenario Outline: Citizen create and delete with scenario outline
    When User a citizenship name as "<citizenShipName>" shortname as "<shortName>"
    Then Success massage should be displayed

    When User a citizenship name as "<citizenShipName>" shortname as "<shortName>"
    Then Already exists message should be displayed
    And Click on close button

    When User delete the "<citizenShipName>"
    Then Success massage should be displayed

    Examples:
      | citizenShipName | shortName |
      | Turkish2        | TR        |
      | English2         | EN        |
      | France2          | FR        |
      | Germany2         | DE        |