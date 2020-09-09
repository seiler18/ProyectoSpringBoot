package desafioplaneta.interfaces;

import java.util.List;

import desafioplaneta.modelo.Luna;



public interface ILuna {
public List<Luna> construyeLunas(String nombre, double diametro, double tiempoOrbita);
}
