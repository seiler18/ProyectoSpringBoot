package cl.desafiolatam.contactManager.facade;

import java.util.List;

import cl.desafiolatam.contactManager.model.Contact;

public interface ContactFacade {

	public List<Contact> getContactList();
	public List<Contact> getContactList(String criterio);
	public boolean addContact(Contact contact);
	public boolean deleteContact(int id);
}
