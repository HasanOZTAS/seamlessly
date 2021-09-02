Feature: Upload Edit Delete File Functionality

  Background:
    Given the user is logged in
    And the user navigate to "files"

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

  Scenario Outline: User can move any item to any folder
    When the user move the <item> to <folder>
    Then the user should see <item> in <folder>

    Examples:
    |item | folder |
    |"gul"|"Notlar"|
  @wip
  Scenario Outline: User can copy any item to any folder
    When the user copy the <item> to <folder>
    Then the user should see <item> in <folder>

    Examples:
      |item | folder |
      |"3d-3"|"Notlar"|

