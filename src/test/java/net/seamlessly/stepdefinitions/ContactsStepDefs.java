package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.ContactsPage;

public class ContactsStepDefs {


    @Given("the user clicks on {string} module")
    public void the_user_clicks_on_module(String module) {

        new ContactsPage().navigateTo(module);

    }

    @When("the user clicks on New Contact button")
    public void the_user_clicks_on_New_Contact_button() {

        new ContactsPage().newContactBtn.click();


    }

    @Then("the user can put {string} and {string}")
    public void the_user_can_put_and(String firstName, String lastName) {

        new ContactsPage().addFirstName.sendKeys(firstName);
        new ContactsPage().addLastName.sendKeys(lastName);

    }

    @When("the user clicks on All contacts button")
    public void the_user_clicks_on_All_contacts_button() {

        new ContactsPage().allContactsBtn.click();

    }

    @Then("the user should see the {string} in the All contacts list")
    public void the_user_should_see_the_initials_in_the_All_contacts_list(String initials) {


    }
}
