package cl.desafiolatam.contactManager.service;

import java.util.List;

import cl.desafiolatam.contactManager.model.Contact;

public interface ContactService {
	public List<Contact> getContactList();
	public boolean addContact(Contact contact);
	public boolean deleteContact(int id);
}
