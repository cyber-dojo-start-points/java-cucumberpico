Feature: how long the answer is

  Scenario: a smaller board
    Given the hitch-hiker selects some tiles
    When they spell 2 times 3
    Then the score is 6
