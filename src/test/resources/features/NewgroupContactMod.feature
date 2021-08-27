@new
Feature: New Group under Contact Module

  Background:
    Given the user is logged in
    When the user click "Contacts" module


  Scenario: User can create a new group under Contacts Module
    Then the user on the contacts page
    When the user click plus button
    Then the user can see "Create a new group" text in the box
    When the user enter new group name in the box

  Scenario: User can add "Groups" dropdown menu existing inside that specific contact’s own info menu
    Then the user on the contacts page
    When the user click plus button
    Then the user can see "Create a new group" text in the box
    When the user enter new group name in the box
    And the user click All contacts button
    And the user click contact
    And the user click groups dropdown menu
    Then the user can see "STAR"







