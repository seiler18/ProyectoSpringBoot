package cl.desafiolatam.contactManager.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cl.desafiolatam.contactManager.model.Contact;
import cl.desafiolatam.contactManager.service.ContactService;

public class ContactTest {

	@Autowired 
	private List<Contact>listaContactos;
	@Autowired
	private ContactService contactService;
	@Autowired
	private Contact contact;
	@Before
	public void setUp() throws Exception {
		contact.setNombre("Jesus");
		contact.setApellidoPaterno("Seiler");
		contact.setApellidoMaterno("Velasquez");
		contact.setDireccion("Volcanes");
		contact.setTelefono("1234");
	}

	@Test
	//Caso1 consultar lista vacia
	public void test1() {
		assertNotNull(contactService.getContactList());
		assertEquals(0, contactService.getContactList().size());
		
	}
	
	@Test
	//Caso2 agregar un contacto
	public void test2() {
		assertTrue(contactService.addContact(contact));
		assertEquals(0, contactService.getContactList().size());
		assertTrue(contactService.getContactList().get(0).getId()==1);
		
	}

}
