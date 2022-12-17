package upeu.edu.pe.backendlogin.service;

import java.util.List;


import upeu.edu.pe.backendlogin.entity.OrganizacionSocial;

public interface OrganizacionService {
	
	List<OrganizacionSocial> readAllOrganizacion();
	OrganizacionSocial save(OrganizacionSocial std);
	void deleteById(int id);

}
