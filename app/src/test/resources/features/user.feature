@api
Feature: Get user by ID

  Scenario: Get user with valid ID
    Given API base url is set
    When user sends GET request to get user by id "60d0fe4f5311236168a109ca"
    Then response status code should be 200
