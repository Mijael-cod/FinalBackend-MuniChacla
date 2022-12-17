package upeu.edu.pe.backendlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.backendlogin.entity.Ruos;
import upeu.edu.pe.backendlogin.service.RuosService;

@RestController
@RequestMapping("/api/ruos")
@CrossOrigin({"*"})
public class RuosController {
	
	@Autowired
	RuosService ruosService;
	
	@GetMapping("/listar")
	public List<Ruos> getRuos(){
		return ruosService.readAllRuos();
	}
	
	@PostMapping("/add")
    public Ruos addRuos(Ruos std) {
        return ruosService.save(std);
    } 

}
