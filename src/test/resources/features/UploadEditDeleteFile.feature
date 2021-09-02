Feature: Upload Edit Delete File Functionality

  Background:
    Given the user is logged in
@wip
  Scenario Outline: User can upload a file
    And the user navigate to "files"
    When the user upload <file>
    Then the user should see <file> on page

    Examples:
    |file|
    |"testJPGFile.jpg"|
    |"testTXTFile.txt"|


