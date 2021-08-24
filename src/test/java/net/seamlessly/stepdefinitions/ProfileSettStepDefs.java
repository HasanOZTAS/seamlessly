package net.seamlessly.stepdefinitions;

import io.cucumber.java.en.*;
import net.seamlessly.pages.ProfileSettingsPage;
import net.seamlessly.utilities.BrowserUtils;
import org.junit.Assert;

import java.util.List;

public class ProfileSettStepDefs {



    @Given("the user clicks settings label")
    public void the_user_clicks_settings_label() {
      new ProfileSettingsPage().settings.click();
    }

    @Then("the user should see following labels")
    public void the_user_should_see_following_labels(List <String> expectedLabels) {
        List<String> actualElementsText = BrowserUtils.getElementsText(new ProfileSettingsPage().personelInfoLabels);

        Assert.assertTrue(actualElementsText.containsAll(expectedLabels));

    }

    @Given("the user enters the name {string}")
    public void the_user_sendkeys(String name) {
        new ProfileSettingsPage().fullNameTextbox.clear();
        new ProfileSettingsPage().fullNameTextbox.sendKeys(name);
    }

    @Then("the user should be able to see the {string}")
    public void the_user_should_be_able_to_see_the(String expectedName) {

        String actualName = new ProfileSettingsPage().fullNameTextbox.getAttribute("value");
        Assert.assertEquals(expectedName,actualName);
    }

}
