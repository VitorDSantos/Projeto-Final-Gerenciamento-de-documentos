package ProjetoFinal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProjetoFinal.ApiGerenciadorDoc.model.Processos;
import ProjetoFinal.controllers.dtos.ProcessosDto;
import ProjetoFinal.repositorios.ProcessosRepository;

@RestController
@RequestMapping
public class ProcessosController {

	
	@Autowired
	ProcessosRepository repositorioProcessos;
	
@GetMapping
public List<ProcessosDto> list(Processos processos){
	return null;
	
}

}
