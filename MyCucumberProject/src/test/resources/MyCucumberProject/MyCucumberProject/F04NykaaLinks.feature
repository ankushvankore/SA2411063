@AllLinks
Feature: Validate Links on Nykaa

  Background: 
    Given Launch "https://www.nykaa.com/"

@Makeup
  Scenario: Test Makeup Link
    When Click on Makeup Link
    Then Makeup page should display

@Skin
  Scenario: Test Skin Link
    When Click on Skin Link
    Then Skin Page should display

@MomBaby
  Scenario: Test Mom and Baby link
    When Click on Mom and Baby link
    Then Mom and Baby page should display

@Men
  Scenario: Test Men Link
    When Click on Men link
    Then Men page should display
