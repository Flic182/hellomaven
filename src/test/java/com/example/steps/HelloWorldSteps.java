package com.example.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.example.HelloWorld;

/**
 * This class defines the steps for the Cucumber HelloWorld feature set.
 *
 * @author Felicity Hughes
 * @since 10
 */
public class HelloWorldSteps {
    /**
     * Instance of the class under test.
     */
    private HelloWorld greeter = new HelloWorld();

    /**
     * 'Then' step, which asserts the output of
     * {@link HelloWorld#printGreeting()} equals the supplied value.
     *
     * @param greeting The expected greeting from the {@link HelloWorld} class.
     */
    @Then("should result in (.*)")
    public void checkGreeting(String greeting) {
        assertEquals(greeter.printGreeting(), greeting);
    }

    /**
     * 'Given' step, which asserts the {@link HelloWorld#setName(String)}
     * method properly saves the supplied name.
     *
     * @param name The name to set in the {@link HelloWorld} class.
     */
    @Given("the name (.*)")
    public void setName(String name) {
        greeter.setName(name);
        assertEquals(greeter.getName(), name);
    }

    /**
     * 'When' step, which asserts the {@link HelloWorld#setSalutation(String)}
     * method properly saves the supplied salutation.
     *
     * @param salutation The salutation to set in the {@link HelloWorld} class.
     */
    @When("combined with (.*)")
    public void setSalutation(String salutation) {
        greeter.setSalutation(salutation);
        assertEquals(greeter.getSalutation(), salutation);
    }
}
