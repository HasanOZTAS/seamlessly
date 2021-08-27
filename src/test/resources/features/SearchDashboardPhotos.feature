Feature: Search Functionalities Dashboard Photos

  Background:
      Given the user is logged in

    Scenario:User can search file typing its name through the magnifying glass icon and
              see the details side page of the file when clicked on it.
      When User can click the magnifying glass icon
      And  User can write "Readme" into the text box
      And  User can click on the file name
      Then User can see the details side page of the "Readme"



