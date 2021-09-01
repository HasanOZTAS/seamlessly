package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.NotesPage;
import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class NotesStepDefs {
    NotesPage notesPage = new NotesPage();

    @When("the user click New Note")
    public void theUserClickNewNote() {
        notesPage.createNewNote.click();
        BrowserUtils.waitFor(1);

    }

    @When("the user write {string}")
    public void the_user_write(String note) {
        BrowserUtils.hover(notesPage.textPage);
        notesPage.textPage.click();
        notesPage.textPageInside.sendKeys(note);
        BrowserUtils.waitFor(5);
    }

    @Then("note title should match with first words of {string}")
    public void note_title_should_match_with_first_words_of(String note) {
        String actualNoteTitle = notesPage.lastNote.getAttribute("title").substring(0,10);
        System.out.println("actualNoteTitle = " + actualNoteTitle);
        System.out.println("note = " + note);

        Assert.assertTrue(note.contains(actualNoteTitle));
          BrowserUtils.waitFor(2);
    }

}
