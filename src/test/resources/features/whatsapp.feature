@file_delivery
  Feature: User should be able to send a file to contact in the contact list

    Scenario: To verify the file delivery between contacts
      Given I register with a user on whatsapp
      When I navigate to whatsapp chat screen
      And I tap on new chat icon
      And I select a contact from the list
      And I send a random file to that contact
      Then I should see the random file sent to that contact successfully.

