package net.seamlessly.pages;


import net.seamlessly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesPage extends BasePage{
    @FindBy(id = "notes_new_note")
    public WebElement createNewNote;

    @FindBy(xpath = "//pre[@role='presentation']")
    public WebElement textPage;

    @FindBy(xpath = "(//textarea)[2]")
    public WebElement textPageInside;

    @FindBy(xpath = "//ul[@class='app-navigation__list']//li[3]//span")
    public WebElement lastNote;

    @FindBy(xpath = "//ul[@class='app-navigation__list']//li[3]//div/button")
    public WebElement rightNoteDots;

    public void clickRightDotsFeatures(String featureName){
        Driver.get().findElement(By.xpath("//span[@class='action-button__text'][.='"+featureName+"']")).click();
    }

}