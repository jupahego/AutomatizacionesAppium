Feature: Login eribank app
  As a user
  I want to enter to app with user and password
  to have access to the application

  Scenario Outline: Login Eribank valid
    Given I like a user open the app
    When he enters with valid user data
      | userName   | userPassword   |
      | <userName> | <userPassword> |
    Then he can see the main menu
    Examples:
      | userName | userPassword |
      | company  | company      |

