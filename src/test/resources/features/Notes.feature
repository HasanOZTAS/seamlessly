Feature: Notes Module

  Background:
    Given the user is logged in

  Scenario Outline: Verify user can create a new note
    When the user click "Notes" module
    When the user click New Note;


    Examples:
      |  |