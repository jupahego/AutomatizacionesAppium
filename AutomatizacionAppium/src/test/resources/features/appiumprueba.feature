Feature: Eribank sign in
  I want to join Eribank

  Scenario: Successful logIn in EriBank
    Given I want log in to the application
    When I enter the username and password
    And I click the login button
    Then I verify that the login is successful
