package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.NotesPage;
import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

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
        String actualNoteTitle = notesPage.lastNote.getAttribute("title").substring(0, 10);
        System.out.println("actualNoteTitle = " + actualNoteTitle);
        System.out.println("note = " + note);

        Assert.assertTrue(note.contains(actualNoteTitle));
        BrowserUtils.waitFor(2);
    }

    @And("the user click three dot on file title")
    public void theUserClickThreeDotOnFileTitle() {
        BrowserUtils.clickWithJS(notesPage.rightNoteDots);
    }

    @And("the user click add to favorite tab")
    public void theUserClickAddToFavoriteTab() {
        notesPage.clickRightDotsFeatures("Add to favorites");
    }

    @And("the user clicks three dot icon on note page")
    public void theUserClicksThreeDotIconOnNotePage() {
        notesPage.leftThreeDots.click();
    }

    @And("the user clicks on Details")
    public void theUserClicksOnDetails() {
        notesPage.DetailsBtn.click();
    }

    @Then("the user should see notes details")
    public void theUserShouldSeeNotesDetails() {
        BrowserUtils.waitFor(3);
        String textDetail = notesPage.detailsText.getText();
        System.out.println("textDetail = " + textDetail);
        Assert.assertTrue(textDetail.contains("word") & textDetail.contains("character"));

    }


    @And("the user enter category {string}")
    public void theUserEnterCategory(String name) {
        BrowserUtils.clickWithJS(notesPage.categoryInput);
        notesPage.categoryInput.sendKeys(name);
        notesPage.forwardBtn.click();
    }

    @And("the user clicks on categories tab")
    public void theUserClicksOnCategoriesTab() {
        BrowserUtils.clickWithJS(notesPage.categoriesTab);
        BrowserUtils.waitFor(5);
    }

    @Then("the user should see the category {string}")
    public void theUserShouldSeeTheCategory(String name) {
        List<String> categoryNames = BrowserUtils.getAttributes(Driver.get().findElements(By.xpath("//ul[@class='app-navigation-entry__children']//li//span")),"title");
        System.out.println("categoryNames = " + categoryNames);
        Assert.assertTrue(categoryNames.contains(name));
    }

    @And("the user clicks on delete button")
    public void theUserClicksOnDeleteButton() {
        notesPage.clickRightDotsFeatures("Delete note");
    }

    @Then("the user should see deletion message")
    public void theUserShouldSeeDeletionMessage() {
        BrowserUtils.waitFor(2);
        String deleteMsg= notesPage.deleteMessage.getText();
        Assert.assertTrue(deleteMsg.contains("Deleted"));

    }
}
