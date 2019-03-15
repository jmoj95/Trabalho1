package br.ufc.quixada.dadm.trabalho1.dao;

import java.util.ArrayList;
import java.util.List;

import br.ufc.quixada.dadm.trabalho1.entity.Contact;

public class ContactDAO {

    private static List<Contact> contacts = new ArrayList<>();
    private static ContactDAO instance = new ContactDAO();

    private ContactDAO() {
        contacts.add(new Contact("Murilo Pai"));
        contacts.add(new Contact("Murilo Jr."));
        contacts.add(new Contact("Auxiliadora"));
        contacts.add(new Contact("Aghata"));
        contacts.add(new Contact("Aryadny"));
    }

    public static ContactDAO getInstance() {
        return instance;
    }

    public static List<Contact> getAll() {
        return contacts;
    }

    public static Contact get(Integer index) {
        return contacts.get(index);
    }

    public static void add(Contact contact) {
        contacts.add(contact);
    }

    public static void edit(Integer index, Contact contact) {
        contacts.remove(index);
        contacts.add(index, contact);
    }

    public static void remove(Integer index) {
        contacts.remove(index);
    }

}
