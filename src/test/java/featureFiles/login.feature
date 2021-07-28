Feature: Login Functionally


  Scenario: Login with validate username and password
    Given Navigate to Basqar
    Then   Enter valid username and password
    Then  Dashboard text should be displayed

    Scenario: Login with invalid username and password
      Given Navigate to Basqar
      Then  Enter invalid username and password
      Then Invalid text should be displayed