package cl.desafiolatam.bodega.dto;

import java.util.List;

import cl.desafiolatam.bodega.model.Material;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MaterialDTO extends VisualObject {
	private Material material;
	private List<Material> materiales;

	public MaterialDTO(List<Material> materiales, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.materiales = materiales;
	}
}