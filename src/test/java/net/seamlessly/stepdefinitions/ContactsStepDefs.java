package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.ContactsPage;
import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.Driver;
import org.junit.Assert;
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

        // put first name
        new ContactsPage().addFirstName.sendKeys(firstName);
        BrowserUtils.waitFor(3);
        // put last name
        new ContactsPage().addLastName.sendKeys(lastName);
        BrowserUtils.waitFor(3);

    }

    @When("the user clicks on All contacts button")
    public void the_user_clicks_on_All_contacts_button() {

        // click on "All contacts button"
        new ContactsPage().allContactsBtn.click();

    }

    @Then("the user should see the {string} in the All contacts list")
    public void the_user_should_see_the_initials_in_the_All_contacts_list(String expectedInitials) {

        BrowserUtils.waitFor(3);

        // Create list of all contacts
        List<WebElement> allContactsList = ContactsPage.listOfAllContacts();

        for (WebElement contact : allContactsList) {
            System.out.println(contact.getText());
        }

        // change the list to a new list that contains first 3 chars of the contacts

        String actualInitials = allContactsList.get(allContactsList.size()-1).getText();
        System.out.println("actualInitials = " + actualInitials);

        Assert.assertTrue(actualInitials.contains(expectedInitials));


    }

    @Then("the user should see all the contacts as a list inside the middle column")
    public void the_user_should_see_all_the_contacts_as_a_list_inside_the_middle_column() {

        BrowserUtils.waitFor(3);

        // Create list of all contacts
        List<WebElement> allContactsList = ContactsPage.listOfAllContacts();
        //List<WebElement> allContactsList = Driver.get().findElements(By.xpath("//div//div[@class='app-content-list-item-line-one']"));


        for (WebElement contact : allContactsList) {
            System.out.println(contact.getText());
        }


    }

    @Then("the user should see total number of contacts")
    public void the_user_should_see_total_number_of_contacts() {

        // get actual numbers(size) of "All contacts" from the list of middle menu
        int actualContactNum = ContactsPage.listOfAllContacts().size();
        System.out.println("actualContactNum = " + actualContactNum);

        // get expected numbers of "All contacts" from the menu and convert to int.
        int expectedContactNum = Integer.parseInt(new ContactsPage().contactTotalNum.getText());
        System.out.println("expectedContactNum = " + expectedContactNum);

        Assert.assertEquals(expectedContactNum, actualContactNum);

    }

    @When("the user clicks on an existing contact")
    public void the_user_clicks_on_an_existing_contact() {

        BrowserUtils.waitFor(2);
        // click on an existing contact
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
        // click on "Choose from files"
        new ContactsPage().chooseFromFiles.click();


    }

    @Then("the user should be able to change the profile picture")
    public void the_user_should_be_able_to_change_the_profile_picture() {

        BrowserUtils.waitFor(1);
        // click on picture
        new ContactsPage().pictureFile.click();

        // click on Choose
        new ContactsPage().chooseButton.click();
        BrowserUtils.waitFor(1);

        Assert.assertTrue(new ContactsPage().contactAvatar.isEnabled());
    }


    @When("the user selects any {string} on the middle column")
    public void the_user_selects_any_on_the_middle_column(String string) {


    }

    @When("the user clicks on Delete option from the three dotted menu")
    public void the_user_clicks_on_Delete_option_from_the_three_dotted_menu() {


    }

    @Then("the user should be able to delete the contact")
    public void the_user_should_be_able_to_delete_the_contact() {


    }

}
