package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewGroupContactsPage extends BasePage{

    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-add']")
    public WebElement plusButton;

     @FindBy(xpath = "//span[contains(text(),'Cre')]")
    public WebElement newgroupText;

     @FindBy(css=".action-input__input")
    public WebElement newGroupTextBox;
}
