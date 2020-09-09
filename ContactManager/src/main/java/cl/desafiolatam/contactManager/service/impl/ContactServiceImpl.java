package cl.desafiolatam.contactManager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.contactManager.dao.ContactDAO;
import cl.desafiolatam.contactManager.model.Contact;
import cl.desafiolatam.contactManager.service.ContactService;

@Service("contactService")
public class ContactServiceImpl implements ContactService {
		
@Autowired
private List<Contact>listaContactos;
@Autowired
private ContactDAO contactDAO;
@Autowired


	
	
	public List<Contact>getContactList(){
		
//		if (listaContactos.size() == 1 && listaContactos.get(0).getId()==0) {
//			listaContactos.remove(0);
//		}
//			
//		return listaContactos;
		return contactDAO.getContactList();
	}
	

	@Override
	public boolean addContact(Contact contact) {
//		// TODO Auto-generated method stub
//				contact.setId(listaContactos.size()+1);
//				listaContactos.add(contact);
//				
				return contactDAO.addContact(contact);
	}


	@Override
	public boolean deleteContact(int id) {
		// TODO Auto-generated method stub
		return contactDAO.deleteContact(id);
	}

}
