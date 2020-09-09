package cl.desafiolatam.Asociaciones.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name="SQ_CLIENTE", initialValue=1, allocationSize=1,sequenceName = "SQ_CLIENTE")
public class Cliente {
@Id
@GeneratedValue(strategy= GenerationType.SEQUENCE,
generator="SQ_CLIENTE")
private Integer id;
private String nombre;
}

