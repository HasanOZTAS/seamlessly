package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FolderViewPage extends BasePage {

    @FindBy(xpath="/html/body/header/div[1]/ul/li[1]")
    public WebElement files;

    @FindBy(id="headerName")
    public WebElement name;

    @FindBy(xpath="/html/body/div[3]/div[2]/div[2]/table/thead/tr/th[3]/a/span[1]")
    public WebElement size;


    @FindBy(xpath="/html/body/div[3]/div[2]/div[2]/table/thead/tr/th[4]/a/span[1]")
    public WebElement modified;

    @FindBy(id="view-toggle")
    public WebElement toggle;

}
