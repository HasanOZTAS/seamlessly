package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import net.seamlessly.pages.BasePage;
import net.seamlessly.pages.HomePage;
import net.seamlessly.pages.SearchDashboardPhotosPage;
import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    @When("User can click contacts icon")
    public void user_can_click_contacts_icon() {
        new SearchDashboardPhotosPage().contacts.click();
        BrowserUtils.waitFor(3);
    }

    @When("User can write {string} into the contact text box")
    public void user_can_write_into_the_contact_text_box(String name) {
        new SearchDashboardPhotosPage().contactsTextBox.sendKeys(name);
        BrowserUtils.waitFor(2);
    }
    @Then("User can see the contact name related to keyword {string}")
    public void user_can_see_the_contact_name_related_to_keyword(String name) {
       Assert.assertTrue(new SearchDashboardPhotosPage().actualName.getText().contains(name));
    }

    @When("User can click photos icon")
    public void user_can_click_photos_icon() {
        BrowserUtils.waitFor(3);
       new SearchDashboardPhotosPage().photosIcon.click();
       BrowserUtils.waitFor(3);
    }

    @When("User should be on the {string}")
    public void user_should_be_on_the_photos_page(String url) {
        Assert.assertEquals(Driver.get().getCurrentUrl(),url);
        System.out.println("Driver.get().getCurrentUrl() = " + Driver.get().getCurrentUrl());

    }

    @Then("User can see only the images files with the extension of {string} or {string}")
    public void user_can_see_only_the_images_files_with_the_extension_of_jpeg_jpg(String extension,String extension2) {
        System.out.println("photo file name = " + new SearchDashboardPhotosPage().extension.getText());
        Assert.assertTrue(new SearchDashboardPhotosPage().extension.getText().contains(extension)||
                new SearchDashboardPhotosPage().extension.getText().contains(extension2));

        BrowserUtils.waitFor(3);
    }

    @When("User can click seamlessly icon on dashboard")
    public void user_can_click_seamlessly_icon_on_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should be on the files page as home page")
    public void user_should_be_on_the_files_page_as_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User can see only the images files with the extension of jpeg")
    public void userCanSeeOnlyTheImagesFilesWithTheExtensionOfJpeg() {
        System.out.println();
    }
}
