package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.FilesPage;

import net.seamlessly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

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


//    @Then("the user should see {string} on page")
//    public void the_user_should_see_on_page(String uploadedFile) {
//        String [] str=uploadedFile.split("\\.");
//
//        String expectedUploadedFile=str[0];
//        String actualUploadedFile=new FilesPage().isUploaded(uploadedFile);
//
//        System.out.println("expectedUploadedFile = " + expectedUploadedFile);
//        System.out.println("actualUploadedFile = " + actualUploadedFile);
//        Assert.assertEquals(expectedUploadedFile, actualUploadedFile);
//
//
//    }

    @When("the user create new folder {string}")
    public void the_user_create_new_folder_TestFolder(String fileName) {
        new FilesPage().createFolder(fileName);
    }

//    @Then("the user should see folder on page {string}")
//    public void the_user_should_see_TestFolder_on_page(String createdFolder) {
//        String expectedFolder=createdFolder;
//        String actualFolder=new FilesPage().isCreated(createdFolder);
//
//        Assert.assertEquals(expectedFolder, actualFolder);
//
//    }

    @Then("the user should see folder on page {string}")
    public void the_user_should_see_TestFolder_on_page(String createdFolder) {
        String expectedFolder=createdFolder;
        String actualFolder=new FilesPage().isUploadedOrCreated(createdFolder);

        Assert.assertEquals(expectedFolder, actualFolder);

    }

    @Then("the user should see {string} on page")
    public void the_user_should_see_on_page(String addedFile) {

        if (addedFile.contains(".")) {
            String [] str=addedFile.split("\\.");

            String expectedUploadedFile=str[0];
            String actualUploadedFile=new FilesPage().isUploadedOrCreated(addedFile);

            System.out.println("expectedUploadedFile = " + expectedUploadedFile);
            System.out.println("actualUploadedFile = " + actualUploadedFile);
            Assert.assertEquals(expectedUploadedFile, actualUploadedFile);
        }
        else {
            String expectedFolder=addedFile;
            String actualFolder=new FilesPage().isUploadedOrCreated(addedFile);

            Assert.assertEquals(expectedFolder, actualFolder);
        }

    }

    @When("the user move the {string} to {string}")
    public void the_user_move_the_to(String item, String folder) {
        new FilesPage().moveTo(item, folder);
    }

    @Then("the user should see {string} in {string}")
    public void the_user_should_see_in(String item, String folder) {
        new FilesPage().openItem(folder);
        String path="//tr[@data-path='/"+folder+"']//span[text()='"+item+"']";
        new FilesPage().scrollDown();
        String actualresult=Driver.get().findElement(By.xpath(path)).getText();
        String expectedResult=item;

        Assert.assertEquals(expectedResult, actualresult);

    }

    @When("the user copy the {string} to {string}")
    public void the_user_copy_the_to(String item, String folder) {
        new FilesPage().copyTo(item, folder);
    }

    @When("the user delete any selected {string}")
    public void the_user_delete_any_selected(String item) {
        new FilesPage().deleteItem(item);
    }

    @Then("the user should see {string} in deleted files")
    public void the_user_should_see_in_deleted_files(String item) {
        String expectedResult=item;
        String actualResult=new FilesPage().isInDeletedFile(item);

        Assert.assertEquals(expectedResult, actualResult);

    }






}
