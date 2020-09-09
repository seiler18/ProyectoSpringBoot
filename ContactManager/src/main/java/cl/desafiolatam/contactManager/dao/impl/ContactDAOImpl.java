package cl.desafiolatam.contactManager.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import cl.desafiolatam.contactManager.dao.ContactDAO;
import cl.desafiolatam.contactManager.model.Contact;
import cl.desafiolatam.contactManager.model.ContactMapper;

@Repository("contactDAO")
public class ContactDAOImpl implements ContactDAO {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Contact> getContactList() {

		return jdbcTemplate.query("SELECT id_contacto, nombre, apellido_paterno, apellido_materno, direccion, telefono\r\n" + 
				"	FROM public.contacto;", new ContactMapper());

	}

	public boolean addContact(Contact contact) {
		// TODO Auto-generated method stub
		int resultado = jdbcTemplate.update("INSERT INTO public.contacto(\r\n" + 
				"  nombre, apellido_paterno, apellido_materno, direccion, telefono)\r\n" + 
				"	VALUES (?, ?, ?, ?, ?)",contact.getNombre(),contact.getApellidoPaterno(),contact.getApellidoMaterno(),contact.getDireccion(),contact.getTelefono());
		return resultado==1?true:false;
	}

	@Override
	public boolean deleteContact(int id) {
		// TODO Auto-generated method stub
		int resultado = jdbcTemplate.update("DELETE FROM public.contacto ");
				// WHERE \"id_contacto\"=?",id);
		return resultado==1?true:false;
	}

	
	
	
	
	

}
