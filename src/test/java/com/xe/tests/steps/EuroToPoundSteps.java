package com.xe.tests.steps;

import com.xe.tests.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kotche on 19/12/2016.
 */
public class EuroToPoundSteps {

    @Autowired
    private HomePage homePage;

    @Autowired
    private WebDriver browser;

    @Given("^I navigate to XE website$")
    public void i_navigate_to_XE_website() throws Throwable {
        browser.get("http://www.xe.com/");
    }

    @When("^I would like to convert from euros to pounds$")
    public void i_would_like_to_convert_from_euros_to_pounds() throws Throwable {
            homePage.convert_from_euros_to_pounds();
    }

    @When("^I enter the amount (.*) in euros$")
    public void i_enter_the_amount_in_euros(String amount) throws Throwable {
           homePage.enter_amount_to_convert(amount);
    }

    @Then("^the amount in pounds (.*) should be displayed$")
    public void the_amount_in_pounds_should_be_displayed(String result) throws Throwable {

    }
}
