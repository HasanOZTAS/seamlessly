package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.FilesPage;

import org.junit.Assert;

import javax.swing.*;

public class UploadEditDeleteFileStepDefs {

    @Given("the user navigate to {string}")
    public void the_user_navigate_to(String module) {
        new FilesPage().navigateTo(module);
    }

    @When("the user upload {string}")
    public void the_user_upload(String fileName) {
        new FilesPage().uploadFile(fileName);
    }


    @Then("the user should see {string} on page")
    public void the_user_should_see_on_page(String uploadedFile) {
        String [] str=uploadedFile.split("\\.");

        String expectedUploadedFile=str[0];
        String actualUploadedFile=new FilesPage().isUploaded(uploadedFile);

        System.out.println("expectedUploadedFile = " + expectedUploadedFile);
        System.out.println("actualUploadedFile = " + actualUploadedFile);
        Assert.assertEquals(expectedUploadedFile, actualUploadedFile);


    }




}
