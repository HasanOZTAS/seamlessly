package net.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends BasePage{

    @FindBy(xpath = "(//a[@aria-label='Calendar'])[1]")
    public WebElement Calendar;

}
