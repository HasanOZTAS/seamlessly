package net.seamlessly.stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.NewGroupContactsPage;
import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;




public class NewGroupContactDefs {
    @When("the user click {string} module")
    public void theUserClickModule(String module) {
        new NewGroupContactsPage().navigateTo(module);
        BrowserUtils.waitFor(5);


    }

    @Then("the user on the contacts page")
    public void theUserOnTheContactsPage() {
        String contactPage="http://qa.seamlessly.net/index.php/apps/contacts/All%20contacts";
        String expectedUrl= Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl,contactPage);

    }

    @When("the user click plus button")
    public void theUserClickPlusButton() {
        new NewGroupContactsPage().plusButton.click();
        BrowserUtils.waitFor(4);
    }

    @Then("the user can see {string} text in the box")
    public void theUserCanSeeTextInTheBox(String text) {
        String actualText=new NewGroupContactsPage().newgroupText.getText();
        Assert.assertEquals(text,actualText);

    }

    @When("the user enter new group name in the box")
    public void theUserEnterNewGroupNameInTheBox() {
         new NewGroupContactsPage().newGroupTextBox.sendKeys("STAR"+ Keys.ENTER);
         BrowserUtils.waitFor(2);

    }


}
