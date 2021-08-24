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
}
