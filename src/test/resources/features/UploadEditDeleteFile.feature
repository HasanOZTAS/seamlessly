Feature: Upload Edit Delete File Functionality

  Background:
    Given the user is logged in
    And the user navigate to "files"
@wip
  Scenario Outline: User can upload a file
    When the user upload <file>
    Then the user should see <file> on page

    Examples:
    |file|
    |"testJPGFile.jpg"|
    |"testTXTFile.txt"|

  Scenario Outline: User can create a new folder
    When the user create new folder <folder>
    Then the user should see <folder> on page

    Examples:
    |folder|
    |"TestFolder3"|
    |"TestFolder4"|



