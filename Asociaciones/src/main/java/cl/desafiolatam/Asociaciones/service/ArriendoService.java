package cl.desafiolatam.Asociaciones.service;

import cl.desafiolatam.Asociaciones.model.Arriendo;
import cl.desafiolatam.Asociaciones.model.DTO.ArriendoDTO;

public interface ArriendoService {
ArriendoDTO findAll();
ArriendoDTO add(Arriendo arriendo);
}