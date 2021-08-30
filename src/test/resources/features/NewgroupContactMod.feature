Feature: New Group under Contact Module

  Background:
  Given the user is logged in


  Scenario: User can create a new group under Contacts Module
    When the user click "Contacts" module
    Then the user on the contacts page
    When the user click plus button
    Then the user can see "Create a new group" text in the box
    When the user enter new group name in the box



