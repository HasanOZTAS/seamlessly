package net.seamlessly.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfileSettingsPage extends BasePage {
    @FindBy(xpath="//h3/label[text()='Full name']")
    public WebElement fullNameLabel;

    @FindBy(xpath="//h3/label[text()='Email']")
    public WebElement emailLabel;

    @FindBy(xpath=" //h3/label[text()='Phone number']")
    public WebElement phoneNumberLabel;

    @FindBy(xpath=" //h3/label[text()='Address']")
    public WebElement addressLabel;

    @FindBy(xpath=" //h3/label[text()='Website']")
    public WebElement websiteLabel;

    @FindBy(xpath=" //h3/label[text()='Twitter']")
    public WebElement twitterLabel;

    @FindBy(xpath=" //h3/label[text()='Language']")
    public WebElement languageLabel;

    @FindBy(xpath=" //h3/label[text()='Locale']")
    public WebElement localeLabel;

    @FindBy(xpath=" //h3/label")
    public List<WebElement> personelInfoLabels;


}
