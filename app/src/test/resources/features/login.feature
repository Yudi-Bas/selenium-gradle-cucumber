Feature: Login Feature

  Scenario: Login with valid credentials
    Given user open login page
    When user input valid username and password
    Then user login successfully
