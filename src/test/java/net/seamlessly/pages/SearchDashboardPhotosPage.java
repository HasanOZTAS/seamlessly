package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchDashboardPhotosPage extends BasePage {

    @FindBy(xpath = "(//form/input)[1]")
    public WebElement textbox;

    @FindBy(xpath = "(//ul/li[1]/a)[3]")
    public WebElement clickButton;

    @FindBy(xpath = "(//header)[2]//h2")
    public WebElement detail;
}
