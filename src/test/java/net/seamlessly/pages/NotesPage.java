package net.seamlessly.pages;


import net.seamlessly.utilities.BrowserUtils;
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

    @FindBy(xpath = "(//*[@id='app-navigation-vue']/ul//li[@class='app-navigation-entry']//button)[5]")
    public WebElement rightNoteDots;

    @FindBy(xpath = "(//div[@id='note-container']//button)[1]")
    public WebElement leftThreeDots;

    @FindBy(xpath = "//span[text()='Details']")
    public WebElement DetailsBtn;

    @FindBy(xpath = "//p[@class='app-sidebar-header__subtitle']")
    public WebElement detailsText;

    @FindBy(id = "category")
    public WebElement categoryInput;

    @FindBy(css = ".icon-confirm.loading")
    public WebElement forwardBtn;

    @FindBy(xpath = "//span[@title='Categories']")
    public WebElement categoriesTab;

    @FindBy(xpath = "//span[@class='deletedLabel']")
    public WebElement deleteMessage;


    public void clickRightDotsFeatures(String featureName){
        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//span[@class='action-button__text'][.='"+featureName+"']")));
    }

}