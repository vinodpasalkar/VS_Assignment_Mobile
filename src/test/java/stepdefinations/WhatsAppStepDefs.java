package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.net.MalformedURLException;

public class WhatsAppStepDefs extends BaseClass {

    @Given("I register with a user on whatsapp")
    public void i_register_with_a_user_on_whatsapp() throws MalformedURLException {
        setUp();
    }
    @When("I navigate to whatsapp chat screen")
    public void i_navigate_to_whatsapp_chat_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I tap on new chat icon")
    public void i_tap_on_new_chat_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I select a contact from the list")
    public void i_select_a_contact_from_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("I send a random file to that contact")
    public void i_send_a_random_file_image_docx_pdf_etc_to_that_contact() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see the random file sent to that contact successfully.")
    public void i_should_see_the_random_file_sent_to_that_contact_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
