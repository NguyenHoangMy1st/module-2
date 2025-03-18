package study_case.services;

import study_case.models.Contact;
import java.util.List;

public interface ContactOperations {
    void addContact(Contact contact);
    boolean updateContact(String phoneNumber, Contact newContact);
    boolean deleteContact(String phoneNumber);
    List<Contact> searchContact(String query);
    void sortContacts();
    void readFromCSV(String filePath);
    void writeToCSV(String filePath);
}