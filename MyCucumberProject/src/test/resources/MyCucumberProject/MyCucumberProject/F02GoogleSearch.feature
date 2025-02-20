Feature: Validate Google search

  Scenario: To validate Search functionality on Google
    Given Launch Google in browser
    When Enter text for search in search box
    And Hit Enter key
    Then Valid search result should display
