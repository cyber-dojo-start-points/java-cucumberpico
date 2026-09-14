Feature: hitch-hiker playing scrabble

Rule: the answer is always 42
  Scenario: hitch-hiker playing scrabble in the past
    Given the hitch-hiker selects some tiles
    When they spell 6 times 9
    Then the score is 42

  Scenario: a smaller board
    Given the hitch-hiker selects some tiles
    When they spell 2 times 3
    Then the score is 7

  Scenario: a square board
    Given the hitch-hiker selects some tiles
    When they spell 5 times 5
    Then the score is 26
