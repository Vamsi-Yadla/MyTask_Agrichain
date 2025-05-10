Feature: Longest substring length
  Scenario: Finding the longest substring length without repeating characters in a given string
    Given user is on agrichain website
    When user enters text in the input field "abcabcbb"
    And the user clicks on submit button
    And the user should be navigated to result page
    Then the user should see the output "3"
