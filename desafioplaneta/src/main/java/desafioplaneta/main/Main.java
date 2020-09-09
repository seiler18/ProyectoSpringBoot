package desafioplaneta.main;

import java.util.ArrayList;

import desafioplaneta.modelo.*;

public class Main {

	public static void main(String[] args) {

//Luna(nombre, diametro, tiempoOrbita)
		Luna LunaTierra = new Luna("LunaTierra", 3476, 27322);
		Luna Deimos = new Luna("Deimos", 8, 1263);
		Luna Phobos = new Luna("Phobos", 560, 0.319);
		Luna Adrastea = new Luna("Adrastea", 416, 0.298);
		Luna Amalthea = new Luna("Amalthea", 35108, 0.498);
		Luna Calypso = new Luna("Calypso", 480, 1888);
		Luna Atlas = new Luna("Atlas", 999, 0.602);
		Luna Belinda = new Luna("Belinda", 66, 0.624);
		Luna Bianca = new Luna("Bianca", 42, 0.433);
		Luna Despina = new Luna("Despina", 160 , 0.40);
		Luna Galatea = new Luna("Galatea", 140 , 0.33);

//Planeta(nombre,tamano,Luna1,Luna2, distanciaSol)
		// ---------------------------------------PLANETA TIERRA(1LUNA LUNATIERRA)
		Planeta Tierra = new Planeta("Tierra", 12756, 384400, 149600000);

		// ---------------------------------------PLANETA MARTE(2LUNAS DEIMOS,PHOBOS)
		Planeta Marte = new Planeta("Marte", 6794, 23460, 9270, 227940000);

		// ---------------------------------------PLANETA MERCURIO(NO TIENE LUNA)
		Planeta Mercurio = new Planeta("Mercurio", 4880, 0, 57910000);

		// ---------------------------------------PLANETA VENUS (NO TIENE LUNA)
		Planeta Venus = new Planeta("Venus", 12104, 0, 108200000);

		// ---------------------------------------PLANETA JUPITER (2LUNAS ADRASTEA,AMALTHEA)
		Planeta Jupiter = new Planeta("Jupiter", 71492, 128980, 181300, 108200000);

		// ---------------------------------------PLANETA SATURNO(2LUNAS CALYPSO,ATLAS)
		Planeta Saturno = new Planeta("Saturno", 108728, 137640, 294660, 1429400000);

		// ---------------------------------------PLANETA URANO(2LUNAS BELINDA,BIANCA)
		Planeta Urano = new Planeta("Urano", 51118, 75260, 75260, 1429400000);

		// ---------------------------------------PLANETA NEPTUNO(2LUNAS DESPINA,GALATEA)
		Planeta Neptuno = new Planeta("Neptuno", 49532, 62000, 52500, 1429400000);

	}

}
