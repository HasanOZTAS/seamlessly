package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.HomePage;
import net.seamlessly.pages.SearchDashboardPhotosPage;
import net.seamlessly.utilities.BrowserUtils;
import org.junit.Assert;

public class SearchDashboardPhotosDefs {

    @When("User can click the magnifying glass icon")
    public void user_can_click_the_magnifying_glass_icon() {
        BrowserUtils.waitFor(5);
        new HomePage().magnifying_glass_icon.click();
        BrowserUtils.waitFor(5);
    }

    @When("User can write {string} into the text box")
    public void user_can_write_into_the_text_box(String filename) {
        new SearchDashboardPhotosPage().textbox.sendKeys(filename);
        BrowserUtils.waitFor(5);
    }

    @When("User can click on the file name")
    public void user_can_click_on_the_file_name() {
        new SearchDashboardPhotosPage().clickButton.click();
        BrowserUtils.waitFor(5);

    }

    @Then("User can see the details side page of the {string}")
    public void user_can_see_the_details_side_page_of_the(String filename) {
        System.out.println("new SearchDashboardPhotosPage().detail.getText() = " + new SearchDashboardPhotosPage().detail.getText());
        Assert.assertTrue(new SearchDashboardPhotosPage().detail.getText().contains(filename));
    }

}
