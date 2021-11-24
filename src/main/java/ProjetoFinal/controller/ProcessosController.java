package ProjetoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD:src/main/java/ProjetoFinal/controllers/ProcessosController.java
import ProjetoFinal.controllers.dtos.ProcessosDto;
import ProjetoFinal.controllers.service.ProcessosService;
import ProjetoFinal.repositorios.ProcessosRepository;
=======
import ProjetoFinal.dto.ProcessosDto;
import ProjetoFinal.repository.ProcessosRepository;
import ProjetoFinal.service.ProcessosService;
>>>>>>> fe9b752f630558ac4003b65f7659b913a1affa1e:src/main/java/ProjetoFinal/controller/ProcessosController.java

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
