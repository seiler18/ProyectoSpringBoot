package cl.desafiolatam.bodega.dto;

import java.util.List;

import cl.desafiolatam.bodega.model.Bodega;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BodegaDTO extends VisualObject {
	private Bodega bodega;
	private List<Bodega> bodegas;

	public BodegaDTO(List<Bodega> bodegas, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.bodegas = bodegas;
	}
}
