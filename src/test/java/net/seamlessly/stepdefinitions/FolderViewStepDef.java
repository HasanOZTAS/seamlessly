package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.FolderViewPage;
import net.seamlessly.utilities.ConfigurationReader;
import net.seamlessly.utilities.Driver;
import org.junit.Assert;

public class FolderViewStepDef {


    @When("the user is on dashboard")
    public void theUserIsOnDashboard() {

        Driver.get().get(ConfigurationReader.get("dashboardUrl"));
    }

    @And("the user clicks on name")
    public void theUserClicksOnName() {
        FolderViewPage fp = new FolderViewPage();
        fp.name.click();
    }


    @Then("the view of folders should change by name")
    public void theViewOfFoldersShouldChangeByName() {
         String actual ="";
         FolderViewPage Folder = new FolderViewPage();
         Folder.name.click();


    }

    @And("the user clicks on size")
    public void theUserClicksOnSize() {

        new  FolderViewPage().size.click();

    }

    @Then("the order of the folders should change by size")
    public void theOrderOfTheFoldersShouldChangeBySize() {

    }

    @And("the user clicks on modified")
    public void theUserClicksOnModified() {

        new FolderViewPage().modified.click();

    }

    @Then("the order of the folders should change by date")
    public void theOrderOfTheFoldersShouldChangeByDate() {

    }

    @And("the user clicks on toggle view")
    public void theUserClicksOnToggleView() {

        new FolderViewPage().toggle.click();
    }

    @Then("the order of the folders should change by view")
    public void theOrderOfTheFoldersShouldChangeByView() {
    }

    @And("the user clicks on files")
    public void theUserClicksOnFiles() {
    }

}
