package cl.desafiolatam.contactManager.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ContactMapper implements  RowMapper<Contact>{

	@Override
	public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Contact contact = new Contact();
		contact.setId(rs.getInt("id_contacto"));
		contact.setNombre(rs.getString("nombre"));
		contact.setApellidoPaterno(rs.getString("apellido_paterno"));
		contact.setApellidoMaterno(rs.getString("apellido_materno"));
		contact.setDireccion(rs.getString("direccion"));
		contact.setTelefono(rs.getString("telefono"));
		return contact;
	}

}
