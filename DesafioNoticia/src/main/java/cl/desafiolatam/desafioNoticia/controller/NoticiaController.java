package cl.desafiolatam.desafioNoticia.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class NoticiaController {
	
private final static Logger logger = LoggerFactory.getLogger(NoticiaController.class);


@RequestMapping("/")

public String Noticias (Model model) {
	
	String noticia = "src/main/resources/static/noticias.txt";
	
	ArrayList<String> lista = new ArrayList<String>();
	try {
		
		FileReader fr = new FileReader(noticia);
		BufferedReader br = new BufferedReader(fr);
		String data = br.readLine();
		logger.info("Noticias Listas para mostrar");
		lista.add(data);
		while (data != null) {
			lista.add(data);
			data = br.readLine();
			
			}
		fr.close();
		br.close();
	} catch (Exception e) {
		// TODO: handle exception
		logger.error("ERROR LEYENDO EL ARCHIVO "+noticia + ":" + e);
	}

	
	for (int i = 0; i < lista.size(); i++) {
		String noticiaGeneral[]=lista.get(i).split("@@");
		model.addAttribute("noticia", noticiaGeneral);
		model.addAttribute("descripcion", noticiaGeneral);
		model.addAttribute("imagen", noticiaGeneral);
	}	
		
String noticia1[]=lista.get(1).split("@@");
model.addAttribute("noticia1",noticia1);
model.addAttribute("descripcion1", noticia1);
model.addAttribute("imagen1",noticia1);
	
String noticia2[]=lista.get(2).split("@@");
model.addAttribute("noticia2", noticia2);
model.addAttribute("descripcion2",noticia2);
model.addAttribute("imagen2", noticia2);


String noticia3[]=lista.get(3).split("@@");
model.addAttribute("noticia3", noticia3);
model.addAttribute("descripcion3",noticia3);
model.addAttribute("imagen3", noticia3);


String noticia4[]=lista.get(4).split("@@");
model.addAttribute("noticia4", noticia4);
model.addAttribute("descripcion4",noticia4);
model.addAttribute("imagen4", noticia4);


String noticia5[]=lista.get(5).split("@@");
model.addAttribute("noticia5", noticia5);
model.addAttribute("descripcion5",noticia5);
model.addAttribute("imagen5", noticia5);
	

	
	
	return "index";
}



}

