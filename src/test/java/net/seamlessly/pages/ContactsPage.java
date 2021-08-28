package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{


    @FindBy(id = "new-contact-button")
    public WebElement newContactBtn;

    @FindBy(id = "contact-org")
    public WebElement addFirstName;

    @FindBy(id = "contact-title")
    public WebElement addLastName;

    @FindBy(xpath = "//span[contains(@title, 'All contacts')]")
    public WebElement allContactsBtn;

    @FindBy(xpath = "//div//div[@class='app-content-list-item-line-one']")
    public WebElement contactAvatar;

    @FindBy(xpath = "(//div//div[@class='app-navigation-entry__counter'])[1]")
    public WebElement contactTotalNum;

    @FindBy(xpath = "//div[contains(@class,'action-item contact-header-avatar__menu')]")
    public WebElement avatarMenuOptions;

    @FindBy(xpath = "//span[text()='Choose from files']")
    public WebElement chooseFromFiles;

    @FindBy(xpath = "//tr[@data-entryname='gul.jpg']")
    public WebElement pictureFile;

    @FindBy(xpath = "(//div[@class='oc-dialog-buttonrow onebutton aside'])/button")
    public WebElement chooseButton;

    @FindBy (id = "contact-avatar-upload")
    public WebElement avatarPicUpload;


}
