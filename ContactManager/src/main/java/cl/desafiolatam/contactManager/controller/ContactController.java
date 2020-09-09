package cl.desafiolatam.contactManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.desafiolatam.contactManager.facade.ContactFacade;
import cl.desafiolatam.contactManager.model.Contact;

@Controller
public class ContactController {
	@Autowired
	private Contact contact;
	@Autowired
	private List<Contact> listaContactos;
	@Autowired
	private ContactFacade contactFacade;

	@RequestMapping(value = "/contactManager", method = RequestMethod.GET)
	public String init(ModelMap model) {
		model.put("contact", contact);
		listaContactos = contactFacade.getContactList();
		model.addAttribute("listaContactos", listaContactos);
		return "index";

	}

	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public String UsuarioCreado(ModelMap model) {
		model.put("contact", contact);
		return "usuarioAgregado";

	}

	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(ModelMap model, @ModelAttribute("contact") Contact contact) {
//	model.addAttribute("contact", contact);
		if (contactFacade.addContact(contact)) {
			listaContactos = contactFacade.getContactList();
		}

		model.addAttribute("listaContactos", listaContactos);
		return "index";

	}

	@RequestMapping(value = "/deleteContact", method = RequestMethod.GET)
	public String deleteContact(ModelMap model, @ModelAttribute("id") int id) {
//	model.addAttribute("contact", contact);
		if (contactFacade.deleteContact(id)) {
			listaContactos = contactFacade.getContactList();
		}
		model.addAttribute("contact",contact);
		model.addAttribute("listaContactos",listaContactos);
		return "index";

	}

	@RequestMapping(value = "/searchContact", method = RequestMethod.GET)
	public String searchContact(ModelMap model) {
		model.addAttribute("contact", contact);
		return "index";

	}

}
