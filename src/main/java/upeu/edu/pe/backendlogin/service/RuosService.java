package upeu.edu.pe.backendlogin.service;

import java.util.List;

import upeu.edu.pe.backendlogin.entity.Ruos;

public interface RuosService {
	
	List<Ruos> readAllRuos();
	Ruos save(Ruos std);
	void deleteById(int id);

}
