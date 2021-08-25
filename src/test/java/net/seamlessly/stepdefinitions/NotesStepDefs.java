package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.When;
import net.seamlessly.pages.NotesPage;

public class NotesStepDefs {
    NotesPage notesPage = new NotesPage();
    @When("the user click New Note;")
    public void theUserClickNewNote() {
        notesPage.createNewNote.click();

    }
}
