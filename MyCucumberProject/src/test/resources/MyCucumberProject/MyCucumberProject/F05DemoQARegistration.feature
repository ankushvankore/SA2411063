Feature: Registration on DemoQA site

  Scenario: To validate registration process on DemoQA
    Given Launch DemoQA
    When Enter firstName as "Simran"
    When Enter lastName as "Manjarekar"
    Then Reigstration should successful
