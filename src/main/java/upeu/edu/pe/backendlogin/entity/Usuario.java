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

@Entity
@Table(name = "usuario")
@Data
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusuario")
	private int idusuario;
	
	private String nombre;
	private String apellidoM;
	private String apellidoP;
	private String telefono;
	private String correo;
	private String direccion;
	private String estadousuario;
	
	private String username;
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "id_rol")
	private Rol rol;
	
	
}
