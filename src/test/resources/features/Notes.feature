@new
Feature: Notes Module

  Background:
    Given the user is logged in

  Scenario Outline: Verify user can create a new note

    When the user click "Notes" module
    And the user click New Note
    And the user write "<notes>"
    Then note title should match with first words of "<notes>"


    Examples:
      | notes                      |
      | this is a new note example |
      | you are a perfect SDET!    |

