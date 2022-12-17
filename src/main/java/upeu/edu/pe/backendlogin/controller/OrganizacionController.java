package upeu.edu.pe.backendlogin.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import upeu.edu.pe.backendlogin.entity.OrganizacionSocial;
import upeu.edu.pe.backendlogin.service.OrganizacionService;

@RestController
@RequestMapping("/api/organizacion")
@CrossOrigin({"*"})
public class OrganizacionController {
	
	@Autowired
	OrganizacionService organizacionService;

	@GetMapping("/listar")
	public List<OrganizacionSocial> getOrganizacion(){
		return organizacionService.readAllOrganizacion();
	}
	
	@PostMapping("/add")
    public OrganizacionSocial addOrganizacionSocial(OrganizacionSocial std) {
        return organizacionService.save(std);
    } 
	
}
