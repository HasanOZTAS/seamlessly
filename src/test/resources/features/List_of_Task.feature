
Feature: List of Task

Scenario: create list
  Given the user on the login page
  And the user is logged in
  When user can click task icon
  And Click Add to list
  And Enter "School" task and click save
  Then User cans see left drop down menu "School" appear

Scenario: Add to task
  Given the user on the login page
  And the user is logged in
  When user can click task icon
  And Click Add to list
  And Enter "School" task and click save
  And Enter your task "Homeworks"
  Then User can see created task "Homeworks"

  Scenario:Done tasks
    Given the user on the login page
    And the user is logged in
    When user can click task icon
    And Click Add to list
    And Enter "School" task and click save
    And Enter your task "Homeworks"
    And Click check box of task done
    And Click Completed Icon
    Then User can see task done "Homeworks"

  Scenario:Important task
    Given the user on the login page
    And the user is logged in
    When user can click task icon
    And Click Add to list
    And Enter "School" task and click save
    And Enter your task "Homeworks"
    And Click Important Star
    And Click  Important Icon
    Then User can see  task on Important page "Homeworks"

  Scenario:Current List
    Given the user on the login page
    And the user is logged in
    When user can click task icon
    And Click Add to list
    And Enter "School" task and click save
    And Enter your task "Homeworks"
    And Click Important Star
    And Click  Current Icon
    Then User can see  task on Current page "Homeworks"




