package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchDashboardPhotosPage extends BasePage {

    @FindBy(xpath = "(//form/input)[1]")
    public WebElement textbox;
}
