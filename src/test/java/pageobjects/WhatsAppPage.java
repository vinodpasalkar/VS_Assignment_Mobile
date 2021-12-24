package pageobjects;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import stepdefinations.BaseClass;

import java.util.Objects;

public class WhatsAppPage extends BaseClass {
   // locators
    public By newChatIcon = By.id("com.whatsapp:id/fab");
    public By contactListUser = By.id("com.whatsapp:id/contactpicker_row_status");
    public By inputAttachIcon = By.id("com.whatsapp:id/input_attach_button");
    public By documentIcon = By.id("com.whatsapp:id/icon");
    public By searchIcon = By.id("com.whatsapp:id/menuitem_search");
    public By searchTextBox = By.id("com.whatsapp:id/search_src_text");
    public By documentPicker = By.id("com.whatsapp:id/document_picker_item");
    public By sendButton = By.id("android:id/button1");
    public By messagePreview = By.id("com.whatsapp:id/preview");
    public By infoIcon = By.id("com.whatsapp:id/menuitem_details");
    public By deliveryTime = By.id("com.whatsapp:id/date_time_delivered");
    protected BaseClass base;
    public WhatsAppPage(BaseClass baseClass) {

        base = baseClass;
    }
    // to verify app loaded correctly
    public void isAppLoaded() {
        waitForElementToBeAvailable(newChatIcon);
        waitForElementToBeAvailable(newChatIcon);
        Assertions.assertTrue(isElementPresent(newChatIcon));
    }
    // to verify message delivery
    public boolean isDelivered(){
        waitForElementToBeAvailable(deliveryTime);
        String status = driver.findElement(deliveryTime).getText();
        return !Objects.equals(status, "—");
    }

}
