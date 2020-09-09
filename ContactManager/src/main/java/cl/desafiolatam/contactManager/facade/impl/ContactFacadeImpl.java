
package cl.desafiolatam.contactManager.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.desafiolatam.contactManager.facade.ContactFacade;
import cl.desafiolatam.contactManager.model.Contact;
import cl.desafiolatam.contactManager.service.ContactService;

@Component("contactFacade")
public class ContactFacadeImpl implements ContactFacade {

	@Autowired
	private ContactService contactService;

	public List<Contact> getContactList() {

		return contactService.getContactList();
	}

	public boolean addContact(Contact contact) {
		// TODO Auto-generated method stub

		return contactService.addContact(contact);
	}

	@Override
	public List<Contact> getContactList(String criterio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(int id) {
		// TODO Auto-generated method stub
		return contactService.deleteContact(id);
	}
}
