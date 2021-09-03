package net.seamlessly.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"
        },
        features ="src/test/resources/features",
        glue="net/seamlessly/stepdefinitions",
        tags="@wip",
        //tags="@SEAMLES-483 or @SEAMLES-484 or @SEAMLES-485 or @SEAMLES-486 or @SEAMLES-487 or @SEAMLES-488",
        dryRun = false


)
public class CukesRunner {
}
