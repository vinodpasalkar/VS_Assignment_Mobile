package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.WhatsAppPage;

import java.net.MalformedURLException;
import java.util.List;

public class WhatsAppStepDefs extends BaseClass {

    private final WhatsAppPage whatsAppPage = new WhatsAppPage(null);

    @Given("I register with a user on whatsapp")
    public void i_register_with_a_user_on_whatsapp() throws MalformedURLException {
        setUp();
        whatsAppPage.isAppLoaded();
    }

    @When("I navigate to whatsapp chat screen")
    public void i_navigate_to_whatsapp_chat_screen() {
        waitForElementToBeAvailable(whatsAppPage.newChatIcon);
    }

    @And("I tap on new chat icon")
    public void i_tap_on_new_chat_icon() {
        driver.findElement(whatsAppPage.newChatIcon).click();
    }

    @And("I select a contact from the list")
    public void i_select_a_contact_from_the_list() {
        waitForElementToBeAvailable(whatsAppPage.contactListUser);
        driver.findElement(whatsAppPage.contactListUser).click();
        waitForElementToBeAvailable(whatsAppPage.inputAttachIcon);
        driver.findElement(whatsAppPage.inputAttachIcon).click();
        waitForElementToBeAvailable(whatsAppPage.documentIcon);
        driver.findElement(whatsAppPage.documentIcon).click();
    }

    @And("I send a random file to that contact")
    public void i_send_a_random_file_image_docx_pdf_etc_to_that_contact() {
        waitForElementToBeAvailable(whatsAppPage.searchIcon);
        driver.findElement(whatsAppPage.searchIcon).click();
        waitForElementToBeAvailable(whatsAppPage.searchTextBox);
        driver.findElement(whatsAppPage.searchTextBox).click();
        waitForElementToBeAvailable(whatsAppPage.searchTextBox);
        driver.findElement(whatsAppPage.searchTextBox).sendKeys("pdf");
        driver.findElement(whatsAppPage.documentPicker).click();
        waitForElementToBeAvailable(whatsAppPage.sendButton);
        driver.findElement(whatsAppPage.sendButton).click();

    }

    @Then("I should see the random file sent to that contact successfully.")
    public void i_should_see_the_random_file_sent_to_that_contact_successfully() {
        waitForElementToBeAvailable(whatsAppPage.messagePreview);
        // to pick the latest message from the chat
        List allMessages = driver.findElements(whatsAppPage.messagePreview);
        for(int i=0;i<allMessages.size();i++) {
            Actions action = new Actions(driver);
            action.clickAndHold((WebElement) allMessages.get(allMessages.size()-1)).build().perform();
        }
        waitForElementToBeAvailable(whatsAppPage.infoIcon);
        driver.findElement(whatsAppPage.infoIcon).click();
        waitForElementToBeAvailable(whatsAppPage.deliveryTime);
        Assertions.assertTrue(whatsAppPage.isDelivered());
    }
}
