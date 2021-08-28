package net.seamlessly.pages;

import net.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage extends BasePage{
    @FindBy (xpath ="(//*[.='please do not edit or delete'])[2]/../../*[3]/*[2]")
    public WebElement filesThreeDotMenu;

    @FindBy(xpath = "//span[@class='icon icon-starred']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoritesTab;


    @FindBy(xpath = "//td[@class='filename']/*[1]/*[2]")
    public WebElement favoritedFile;

    @FindBy(xpath = "//span[@class='icon icon-rename']")
    public WebElement rename;

    @FindBy(xpath = "//span[@class='innernametext']")
    public WebElement renameBox;


    public FilesPage() {
        PageFactory.initElements(Driver.get(),this);
    }
}
