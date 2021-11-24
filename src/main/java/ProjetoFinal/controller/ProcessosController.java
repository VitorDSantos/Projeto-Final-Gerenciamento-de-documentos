package ProjetoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProjetoFinal.dto.ProcessosDto;
import ProjetoFinal.repository.ProcessosRepository;
import ProjetoFinal.service.ProcessosService;

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
