package net.seamlessly.stepdefinitions;


import io.cucumber.java.ca.Cal;
import io.cucumber.java.en.Given;
import net.seamlessly.pages.BasePage;
import net.seamlessly.pages.CalendarPage;
import net.seamlessly.pages.LoginPage;
import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.Driver;
import org.junit.Assert;

public class CalendarStepDefs {

    @Given("the user display daily calendar view")
    public void the_user_display_daily_calendar_view() {

        new BasePage().navigateTo("Calendar");
        new CalendarPage().threeDotIcon.click();
        BrowserUtils.waitFor(2);
        new CalendarPage().dayButton.click();

    }

    @Given("the user can display weekly calendar view")
    public void the_user_can_display_weekly_calendar_view() {

        new CalendarPage().weekButton.click();
        BrowserUtils.waitFor(2);

    }

    @Given("the user can display monthly calendar view")
    public void the_user_can_display_monthly_calendar_view() {

        new CalendarPage().monthButton.click();
        BrowserUtils.waitFor(2);


    }

    @Given("the user User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view")
    public void the_user_User_can_create_a_new_event_under_the_Calendar_module_and_see_it_on_the_related_day_through_the_Monthly_Calendar_view() {

      new CalendarPage().newEventButton.click();


    }

    @Given("the user User can delete any event through the Monthly Calendar view by clicking on the event and then using “more” option")
    public void the_user_User_can_delete_any_event_through_the_Monthly_Calendar_view_by_clicking_on_the_event_and_then_using_more_option() {

    }


}
