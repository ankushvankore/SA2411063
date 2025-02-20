Feature: Validate login functionality on Expand Testing

  Background: 
    Given Open ExpandTesting in browser

  Scenario: To validate login functionality with valid data
    When Enter valid username as "practice"
    When Enter valid password as "SuperSecretPassword!"
    And Click on Login button
    Then Home page should display

  Scenario: To validate Login functionality with invalid data
    When Enter invalid username as "varun"
    When Enter invalid password as "varun123"
    And I Click on Login button
    Then Error message should display
