package upeu.edu.pe.backendlogin.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.Ruos;
import upeu.edu.pe.backendlogin.repository.RuosRepository;
import upeu.edu.pe.backendlogin.service.RuosService;

@Service
public class RuosServiceImp implements RuosService{
	
	@Autowired
	RuosRepository ruosRepository;

	@Override
	public List<Ruos> readAllRuos() {
		// TODO Auto-generated method stub
		return ruosRepository.findAll();
	}

	@Override
	public Ruos save(Ruos std) {
		// TODO Auto-generated method stub
		return ruosRepository.save(std);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		ruosRepository.deleteById(id);
		
	}
	
	

}
