Feature: Calendar Module

  Background:
    Given the user is logged in

    Scenario: See Daily-Weekly-Monthly calendar view and create a new event under the Calendar module
      Given the user display daily calendar view
      Given the user can display weekly calendar view
      Given the user can display monthly calendar view
      And   the user User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view
      And   the user User can delete any event through the Monthly Calendar view by clicking on the event and then using “more” option

