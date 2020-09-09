package cl.desafiolatam.ControlDestino.service;

import cl.desafiolatam.ControlDestino.model.Pasajero;
import cl.desafiolatam.ControlDestino.model.DTO.PasajeroDTO;

public interface PasajeroService {
	PasajeroDTO findAll();
	PasajeroDTO add(Pasajero pasajero);
}
