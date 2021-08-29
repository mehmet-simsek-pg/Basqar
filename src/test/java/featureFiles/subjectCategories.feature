Feature: Subject Category Functionally

  Background:
    Given Navigate to Basqar
    When   Enter valid username and password
    Then Dashboard text should be displayed
    Then Navigate to subject category page


  Scenario Outline: Creation New Subject Category

    When Create a Subject Categories name as "<SubjectCategoryName>" Subject Categories code"<SubjectCategoriesCode>"
    Then Success massage should be displayed

    Examples:
      | SubjectCategoryName | SubjectCategoriesCode |
      | MySubjectCat23        | cat                   |



  Scenario Outline: Try to delete MySubjectCat

    And User delete the "<SubjectCategoryName>"
    Then Success massage should be displayed
    Examples:
      | SubjectCategoryName |
      | MySubjectCat        |
