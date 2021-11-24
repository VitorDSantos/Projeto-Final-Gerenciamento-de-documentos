package ProjetoFinal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProjetoFinal.controllers.dtos.ProcessosDto;
import ProjetoFinal.controllers.service.ProcessosService;
import ProjetoFinal.repositorios.ProcessosRepository;

@RestController
@RequestMapping
public class ProcessosController {

	
	@Autowired
	ProcessosRepository repositorioProcessos;
	@Autowired
	ProcessosService service;
	
	
@GetMapping
public List<ProcessosDto> list(ProcessosService service){
	return service.filtrandoNro(0);
	
}

}
