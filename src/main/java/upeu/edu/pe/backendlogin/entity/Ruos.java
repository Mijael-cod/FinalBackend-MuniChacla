package upeu.edu.pe.backendlogin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ruos")

public class Ruos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idruos")
	
	private int idruos;
	private String codigoos;
	private String nombreos;
	private String zona;
	private String fechainicio;
	private String fechavigencia;
	private String resolucion;
	

}
