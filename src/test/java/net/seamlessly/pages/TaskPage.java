package net.seamlessly.pages;

import net.seamlessly.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage extends BasePage{
@FindBy(xpath = "//span[contains(.,'Add List…')]")
public WebElement AddListIcon;

@FindBy(xpath = "//input[@id='newListInput']")
    public WebElement NewListEnter;

@FindBy(xpath = "(//input[@title='Save'])[4]")
    public WebElement SaveIcon;

@FindBy(xpath = "(//span[@title='weekend'])")
    public WebElement LeftDropdownResult;

@FindBy(xpath = "//input[@id='target']")
    public WebElement  AddtoTask;

@FindBy(xpath = "//li/div/div/div/span")
    public WebElement TaskResult;

@FindBy(xpath = "//span[@title='Completed']")
    public WebElement CompletedIcon;

@FindBy(xpath = "//li/div/div/div[@class='title']/span[1]")
    public WebElement CompletedResult;

@FindBy(xpath = "//label[@class='reactive no-nav']")
    public WebElement checkBoxOfTask;
@FindBy(xpath = "//li/div/div/button/span[@class='icon icon-sprt-bw sprt-task-star']")
    public WebElement ImportantStar;
@FindBy(xpath = "//span[@title='Important']")
    public WebElement ImportantIcon;
@FindBy(xpath = "//li/div/div/div/span")
    public WebElement ImportantResult;
@FindBy(xpath = "//span[@title='Current']")
    public WebElement CurrentIcon;
@FindBy(xpath = "//span[.='Homeworks']")
    public WebElement CurrentResult;
@FindBy(xpath ="//span[@title='School']" )
    public WebElement deleteItem;
@FindBy(css = "[aria-controls='menu-mwfhc']")
    public WebElement Optiondots;
@FindBy(xpath = "//span[.='Delete']")
    public WebElement DeleteIcon;



public void deleteList(){

        deleteItem.click ();
        BrowserUtils.waitFor ( 1 );
        Optiondots.click ();
    BrowserUtils.waitFor ( 1 );
        DeleteIcon.click ();
        



}

}
