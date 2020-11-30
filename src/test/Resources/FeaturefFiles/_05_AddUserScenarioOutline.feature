Feature: Add User Data With Scenario Qutline

  Scenario Outline: Login
    Given navigate to sdinc
    Given enter username as "volkan"
    When enter password name as "123456"
    Then click to autentifica

    When click to message box and click trimite
    When select "<Destination>"
    When enter "<Title>"
    When enter text message "<Message>"
    When click to trimite button

    Examples:
      | Destination | Title           | Message                                    |
      | volkan      | Homework week 1 | type code with cpp, sum of the two numbers |
      | volkan      | Homework week 2 | type code with cpp, sum of the two numbers |
      | volkan      | Homework week 3 | type code with cpp, sum of the two numbers |
      | volkan      | Homework week 4 | type code with cpp, sum of the two numbers |


