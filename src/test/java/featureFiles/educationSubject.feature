Feature: Education Subjects Functionally

  Background:
    Given Navigate to Basqar
    When  Enter valid username and password
    Then Dashboard text should be displayed
    And Navigate to education page

  Scenario Outline: Create a education subject

    When Create a subject name as "<SubjectsName>" code as "<SubjectCode>"
    Then Success massage should be displayed

    Examples:
      | SubjectsName | SubjectCode |
      | TestSub      | ts1         |

  Scenario Outline: Delete a education subject

    And User delete the "<SubjectsName>"
    Then Success massage should be displayed
    Examples:
      | SubjectsName |
      | TestSub      |

