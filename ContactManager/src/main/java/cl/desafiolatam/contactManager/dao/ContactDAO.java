package cl.desafiolatam.contactManager.dao;

import java.util.List;

import cl.desafiolatam.contactManager.model.Contact;

public interface ContactDAO {
	public List<Contact> getContactList();
	public boolean deleteContact(int id);
	public boolean addContact(Contact contact);
}
