package ProjetoFinal.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import ProjetoFinal.dto.ProcessosDto;
import ProjetoFinal.form.FormProcessos;
import ProjetoFinal.model.Processos;
import ProjetoFinal.repository.ProcessosRepository;
import ProjetoFinal.service.ProcessosService;





@RestController
@RequestMapping("/processos")
public class ProcessosController {

	
	@Autowired
	ProcessosRepository processosRepository;
	
	@Autowired
	ProcessosService service;
	@Autowired
	Processos processos;
	
	@GetMapping
		public List<ProcessosDto> filtrando(int nro_processos, ProcessosService service) { //depois adicionar por status
			int x = processos.getNroProcesso();
			List<Processos> processos = processosRepository.findByNroProcesso(x);
			return ProcessosDto.converte(processos);
			}
		
	@PostMapping
	public ResponseEntity<ProcessosDto> inserir(@RequestBody @Valid FormProcessos form, UriComponentsBuilder uriBuild){
		Processos processos=form.converte(processosRepository);
		processosRepository.save(processos);
		URI uri= uriBuild.path("/processos{id}").buildAndExpand(processos.getNroProcesso()).toUri();
		return ResponseEntity.created(uri).body(new ProcessosDto(processos));
	}
	
	@GetMapping("/{id}")
	public ProcessosDto detalha (@PathVariable int id, int nro_processos) {
		Processos processos = processosRepository.getOne(id);
		return new ProcessosDto (processos);
	}
	@PutMapping("/{id}")
	public ResponseEntity<ProcessosDto> atualiza(@PathVariable int id, int nro_processos, @RequestBody @Valid FormProcessos form){
		Processos processos=form.atualiza(id, nro_processos, processosRepository);
		return ResponseEntity.ok(new ProcessosDto(processos));
	}
	@DeleteMapping ("/{id}")
	public ResponseEntity<ProcessosDto> remove(@PathVariable int id, int nro_processos){
		processosRepository.deleteById(id);
		int nro_processo= processos.getNroProcesso();
		processosRepository.deleteByNroProcesso(nro_processo);
		return ResponseEntity.ok().build();
	}
}


