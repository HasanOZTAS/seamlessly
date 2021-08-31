package net.seamlessly.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesPage extends BasePage{
    @FindBy(id = "notes_new_note")
    public WebElement createNewNote;

    @FindBy(xpath = "//pre[@class=' CodeMirror-line ']")
    public WebElement textPageInside;

}