@wip
Feature: Contacts Module

  Background:
    Given the user is logged in
    And the user clicks on "Contacts" module

  Scenario: User can create a new contact
    When the user clicks on New Contact button
    Then the user can put "first name" and "last name"

    When the user clicks on All contacts button
    Then the user should see the initials in the All contacts list