Feature: Get manager ID verified

  @sanity
  Scenario: Login with valid credentials and verify Manager ID
    Given I launch the browser and login with valid credentials
    Then The manager ID should match in the welcome greeting
    And Close the browser