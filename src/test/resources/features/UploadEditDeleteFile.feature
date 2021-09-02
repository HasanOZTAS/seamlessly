Feature: Upload Edit Delete File Functionality

  Background:
    Given the user is logged in
@wip
  Scenario Outline: User can upload a file
    And the user navigate to "Files" "All files"
    When the user click on "UploadButton" then click "UploadFile"
    And  the user navigate <file> and upload it
    Then the user should see <file> on page

    Examples:
    |file|
    |testJPGFile.jpg|
    |testTXTFile.txt|


