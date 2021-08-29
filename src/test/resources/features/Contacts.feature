Feature: Contacts Module

  Background:
    Given the user is logged in
    And the user clicks on "Contacts" module


  Scenario Outline: User can create a new contact
    When the user clicks on New Contact button
    Then the user can put "<first name>" and "<last name>"
    When the user clicks on All contacts button
    Then the user should see the "<initials>" in the All contacts list

#    will be revised and made correction

    Examples:
      | first name | last name | initials |
      | Niyazi     | YAMUK     | Niya     |
      | Mike       | SMITH     | Mike     |
      | Seracettin | Neettin   | Sera     |


  Scenario: User can see all the contacts as a list inside the middle column and total number
    When the user clicks on All contacts button
    Then the user should see all the contacts as a list inside the middle column
    And the user should see total number of contacts


  Scenario: User can change the profile picture of any contact by using “Choose from files” option
    When the user clicks on an existing contact
    And the user clicks on the avatar icon on the right side
    Then the user clicks on Choose from files option
    And the user should be able to change the profile picture

  @wip
Scenario Outline: User can delete any selected contact
  When the user selects any "<contacts>" on the middle column
  And the user clicks on Delete option from the three dotted menu
  Then the user should be able to delete the contact

  Examples:
    | contacts |
    | Niyazi     |
#    | Mike       |
#    | Seracettin |