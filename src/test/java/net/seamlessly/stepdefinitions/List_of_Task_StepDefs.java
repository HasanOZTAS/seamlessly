package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.HomePage;
import net.seamlessly.pages.TaskPage;
import net.seamlessly.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class List_of_Task_StepDefs {
    @When("user can click task icon")
    public void user_can_click_task_icon() {
        new HomePage ().TaskIcon.click ();
        BrowserUtils.waitFor ( 5 );
    }

    @When("Click Add to list")
    public void click_Add_to_list() {
        new TaskPage ().AddListIcon.click ();

    }

    @When("Enter {string} task and click save")
    public void enter_task_and_click_save(String TaskName) {

        new TaskPage ().NewListEnter.sendKeys (  TaskName);
     new TaskPage ().NewListEnter.sendKeys ( Keys.ENTER );
    }

    @Then("User cans see left drop down menu {string} appear")
    public void user_cans_see_left_drop_down_menu_appear(String Expected) {
      //  System.out.println ("Result= "+BrowserUtils.getElementsText ( new TaskPage ().leftSideList ).get ( 0 ));

        Assert.assertEquals (Expected,new TaskPage ().LeftDropdownResult.getAttribute ( "title" )  );
        BrowserUtils.waitFor ( 5 );

    }

    @When("Enter your task {string}")
    public void enter_your_task(String task) {
        new TaskPage ().AddtoTask.sendKeys ( task );
        new TaskPage ().AddtoTask.sendKeys ( Keys.ENTER);


    }

    @Then("User can see created task {string}")
    public void user_can_see_created_task(String Expected) {
        Assert.assertEquals ( Expected,new TaskPage ().TaskResult.getText () );
        BrowserUtils.waitFor ( 3 );
        new TaskPage ().deleteList (Expected);


    }
    @When("Click check box of task done")
    public void click_check_box_of_task_done() {
       new TaskPage ().checkBoxOfTask.click ();
    }

    @When("Click Completed Icon")
    public void click_Completed_Icon() {
        new TaskPage ().CompletedIcon.click ();

    }

    @Then("User can see task done {string}")
    public void user_can_see_task_done(String expected) {
        Assert.assertEquals ( expected,new TaskPage ().CompletedResult.getText () );
        new TaskPage ().deleteList (expected);
    }

    @When("Click Important Star")
    public void click_Important_Star() {
        new TaskPage ().ImportantStar.click ();
    }

    @When("Click  Important Icon")
    public void click_Important_Icon() {
       new TaskPage ().ImportantIcon.click ();
    }

    @Then("User can see  task on Important page {string}")
    public void user_can_see_task_on_Important_page(String expected) {
        Assert.assertEquals ( expected,new TaskPage ().ImportantResult.getText () );
        new TaskPage ().deleteList (expected);
    }

    @When("Click  Current Icon")
    public void click_Current_Icon() {
       new TaskPage ().CurrentIcon.click ();
       BrowserUtils.waitFor ( 5 );
    }

    @Then("User can see  task on Current page {string}")
    public void user_can_see_task_on_Current_page(String expected) {
      Assert.assertEquals ( expected,new TaskPage ().CurrentResult.getText () );
        new TaskPage ().deleteList (expected);
    }





}
