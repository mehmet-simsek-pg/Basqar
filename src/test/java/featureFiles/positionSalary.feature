Feature: PositionSalary Functionality

  Background:
    Given Navigate to Basqar
    When Enter valid username and password
    Then  Success massage should be displayed
    Given Navigate to Position Salary

  Scenario: Create a Position Salary
    When Create a position salary name as "Software Tester" short name as "SDET"
    Then Success massage should be displayed


  Scenario: Delete Position Salary

    When User delete the "Software Tester"
    Then Success massage should be displayed
