@Calculator
Feature: Simple Calculator

  @Add
  Scenario: Add to numbers
    Given I have number 5
    And I have number 10
    When I add them
    Then the result should be 15

  @Subtract
  Scenario: Subtract to numbers
    Given I have number 10
    And I have number 5
    When I subtract them
    Then the result should be 5

  @Multiplicate
  Scenario: Multiplicate to numbers
    Given I have number 10
    And I have number 5
    When I multiplicate them
    Then the result should be 45
