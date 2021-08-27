package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.ContactsPage;
import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactsStepDefs {


    @Given("the user clicks on {string} module")
    public void the_user_clicks_on_module(String module) {

        new ContactsPage().navigateTo(module);
        BrowserUtils.waitFor(3);

    }

    @When("the user clicks on New Contact button")
    public void the_user_clicks_on_New_Contact_button() {

        new ContactsPage().newContactBtn.click();
        BrowserUtils.waitFor(2);


    }

    @Then("the user can put {string} and {string}")
    public void the_user_can_put_and(String firstName, String lastName) {

        new ContactsPage().addFirstName.sendKeys(firstName);
        BrowserUtils.waitFor(3);
        new ContactsPage().addLastName.sendKeys(lastName);
        BrowserUtils.waitFor(3);

    }

    @When("the user clicks on All contacts button")
    public void the_user_clicks_on_All_contacts_button() {

        new ContactsPage().allContactsBtn.click();

    }

    @Then("the user should see the {string} in the All contacts list")
    public void the_user_should_see_the_initials_in_the_All_contacts_list(String initials) {

        BrowserUtils.waitFor(3);

        // Create list of all contacts
        List<WebElement> allContactsList = Driver.get().findElements(By.xpath("//div//div[@class='app-content-list-item-line-one']"));


        for (WebElement contact : allContactsList) {
            System.out.println(contact.getText());
        }

    }

    @Then("the user should see all the contacts as a list inside the middle column")
    public void the_user_should_see_all_the_contacts_as_a_list_inside_the_middle_column() {

        BrowserUtils.waitFor(3);

        // Create list of all contacts
        List<WebElement> allContactsList = Driver.get().findElements(By.xpath("//div//div[@class='app-content-list-item-line-one']"));



        for (WebElement contact : allContactsList) {
            System.out.println(contact.getText());
        }


    }

    @Then("the user should see total number of contacts")
    public void the_user_should_see_total_number_of_contacts() {

        System.out.println("contactTotalNum = " + new ContactsPage().contactTotalNum.getText());

    }

    @When("the user clicks on an existing contact")
    public void the_user_clicks_on_an_existing_contact() {

        BrowserUtils.waitFor(2);
        new ContactsPage().contactAvatar.click();

    }

    @When("the user clicks on the avatar icon on the right side")
    public void the_user_clicks_on_the_avatar_icon_on_the_right_side() {

        BrowserUtils.waitFor(1);
        new ContactsPage().avatarMenuOptions.click();

    }

    @Then("the user clicks on Choose from files option")
    public void the_user_clicks_on_Choose_from_files_option() {

        BrowserUtils.waitFor(1);
        new ContactsPage().chooseFromFiles.click();


    }

    @Then("the user should be able to change the profile picture")
    public void the_user_should_be_able_to_change_the_profile_picture() {

        BrowserUtils.waitFor(1);
        new ContactsPage().pictureFile.click();

        new ContactsPage().chooseButton.click();


    }

}
