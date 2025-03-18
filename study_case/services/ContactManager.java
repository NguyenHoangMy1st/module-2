package study_case.services;

import study_case.models.Contact;
import java.io.*;
import java.util.*;

public class ContactManager implements ContactOperations {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public boolean updateContact(String phoneNumber, Contact newContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                contacts.set(i, newContact);
                return true;
            }
        }
        return false;
    }

    public boolean deleteContact(String phoneNumber) {
        return contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));
    }

    public List<Contact> searchContact(String query) {
        List<Contact> results = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getPhoneNumber().contains(query) || c.getName().toLowerCase().contains(query.toLowerCase())) {
                results.add(c);
            }
        }
        return results;
    }

    public void sortContacts() {
        contacts.sort(Comparator.comparing(Contact::getName));
    }

    public void readFromCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            contacts.clear();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 7) {
                    contacts.add(new Contact(values[0], values[1], values[2], values[3], values[4], values[5], values[6]));
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }

    public void writeToCSV(String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Contact c : contacts) {
                bw.write(c.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}