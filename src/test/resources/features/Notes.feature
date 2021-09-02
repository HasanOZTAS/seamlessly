Feature: Notes Module

  Background:
    Given the user is logged in

  Scenario Outline: Verify user can create a new note

    When the user click "Notes" module
    And the user click New Note
    And the user write "<notes>"
    Then note title should match with first words of "<notes>"


    Examples:
      | notes                      |
      | this is a new note example |
      | you are a perfect SDET!    |

 # tamamlanmadı. 4. step !
  Scenario Outline: User can add any note to the favorites
    When the user click "Notes" module
    And the user click New Note
    And the user write "<notes>"
    And the user click three dot on file title
    And the user click add to favorite tab
    And the user navigate to "Files" module
    And the user navigates to favorites tab


    Examples:
      | notes              |
      | sample text for AC |


  Scenario: User can see the number of letters and words that the note includes under the note title when clicked on the details of the note
    When the user navigate to "Notes" module
    And the user clicks three dot icon on note page
    And the user clicks on Details
    Then the user should see notes details


  Scenario Outline: User can create a new category by passing a new category name from inside the notes details
    When the user navigate to "Notes" module
    And the user clicks three dot icon on note page
    And the user clicks on Details
    And the user enter category "<name>"
    And the user clicks on categories tab
    Then the user should see the category "<name>"
    Examples:
      | name              |
      | New Test Category |

  @wip
  Scenario Outline: User can delete any note
    When the user click "Notes" module
    And the user click New Note
    And the user write "<notes>"
    And the user click three dot on file title
    And the user clicks on delete button
    Then the user should see deletion message
    Examples:
      | notes                |
      | Sample note for Test |
