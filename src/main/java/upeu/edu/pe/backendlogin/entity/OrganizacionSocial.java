package upeu.edu.pe.backendlogin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "organizacion")

public class OrganizacionSocial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idorganizacion")
	private int idorganizacion;
	private String cargo;
	private String tipoos;
	private String zonalocal;
	private String nivelos;
	private String representante;
	private String direccion;
	private String archivo;
	private String organizacion;
	
	@ManyToOne
	@JoinColumn(name = "idusuario")
	private Usuario usuario;
	
	
	
	
	

}
