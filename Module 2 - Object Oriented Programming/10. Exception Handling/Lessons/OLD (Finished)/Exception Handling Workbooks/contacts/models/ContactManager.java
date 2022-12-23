package models;

import java.util.ArrayList;

public class ContactManager {
    private ArrayList<Contact> contacts;

    public ContactManager(Contact[] contacts) {
        this.contacts = new ArrayList<Contact>();
        for (int i = 0; i < contacts.length; i++) {
            this.contacts.add(i, contacts[i]);
        }
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void removeContact(int index) {
        this.contacts.remove(index);
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.contacts.size(); i++) {
            temp = temp + this.contacts.get(i).getAge() + " ";
        }
        return temp;
    }
}
