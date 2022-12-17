package upeu.edu.pe.backendlogin.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.OrganizacionSocial;
import upeu.edu.pe.backendlogin.repository.OrganizacionRepository;
import upeu.edu.pe.backendlogin.service.OrganizacionService;

@Service
public class OrganizacionServiceImp implements OrganizacionService{
	
	@Autowired
	OrganizacionRepository organizacionRepository;

	@Override
	public List<OrganizacionSocial> readAllOrganizacion() {
		// TODO Auto-generated method stub
		return organizacionRepository.findAll();
	}

	@Override
	public OrganizacionSocial save(OrganizacionSocial std) {
		// TODO Auto-generated method stub
		return organizacionRepository.save(std);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		organizacionRepository.deleteById(id);
	}
	
	

}
