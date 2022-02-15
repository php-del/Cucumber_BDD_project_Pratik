Feature: Guru 99 login

  Background: Below are the common steps
    Given I launch the browser

  @smoke
  Scenario: Login to the Guru 99 bank application
    When I login to the Guru 99 bank with valid credentials
    Then Proper page title of home page should be displayed
    And Close the browser instance

  @sanity
  Scenario Outline: Login using multiple invalid values
    When I try to login using invalid credentials as "<userid>" and "<password>"
    Then An error is given
    And Close the browser instance
    Examples:
      | userid | password
      | demo   | demo1
      | demo   | demo2