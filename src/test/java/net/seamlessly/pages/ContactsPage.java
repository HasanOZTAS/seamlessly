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


}
