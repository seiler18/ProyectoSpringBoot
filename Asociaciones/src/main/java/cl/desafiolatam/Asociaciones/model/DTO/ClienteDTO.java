package cl.desafiolatam.Asociaciones.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

import cl.desafiolatam.Asociaciones.model.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ClienteDTO extends VisualObject {
private List<Cliente> clientes;
public ClienteDTO(List<Cliente> clientes, String mensaje, String
codigo) {
super(mensaje, codigo);
this.clientes = clientes;
}
}
