Feature: Validate Links on Nykaa

  Background: 
    Given Launch "https://www.nykaa.com/"

  Scenario: Test Makeup Link
    When Click on Makeup Link
    Then Makeup page should display

  Scenario: Test Skin Link
    When Click on Skin Link
    Then Skin Page should display

  Scenario: Test Mom and Baby link
    When Click on Mom and Baby link
    Then Mom and Baby page should display

  Scenario: Test Men Link
    When Click on Men link
    Then Men page should display
