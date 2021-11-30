package projetofinal.controller;

import java.net.URI;
import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import projetofinal.dto.ProcessosDto;
import projetofinal.form.FormProcessos;
import projetofinal.model.Processos;
import projetofinal.model.Status;
import projetofinal.repository.ProcessosRepository;
import projetofinal.service.ProcessosService;


@RestController
@RequestMapping("/processos")
public class ProcessosController {

	@Autowired
	private ProcessosRepository processosRepository;
 
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Autowired
	private ProcessosService service;
	
	private Processos processos;
	
	@GetMapping
	@Cacheable(value = "Docs")
		public List<ProcessosDto> filtrando(@RequestParam int numeroprocesso,
				@RequestParam(required=false)int pag, int quantidade ) { //depois adicionar por status
			Pageable paginacao= PageRequest.of(pag, quantidade);
			Page<Processos> processosPage = processosRepository.findByNroProcesso(numeroprocesso, paginacao);
			return ProcessosDto.converte(processosPage);
	}
		
		
	@PostMapping
	@CacheEvict(value = "Processos", allEntries = true)
	public ResponseEntity<ProcessosDto> inserir(@RequestBody @Valid FormProcessos form, UriComponentsBuilder uriBuild){
		Processos processos=form.converte(processosRepository);
		processosRepository.save(processos);
		URI uri= uriBuild.path("/processos{id}").buildAndExpand(processos.getNroProcesso()).toUri();
		return ResponseEntity.created(uri).body(new ProcessosDto(processos));
	}
	
	@GetMapping("/{id}")
	public ProcessosDto detalha (@PathVariable int id, int numeroprocesso) {
		Processos processos = processosRepository.getOne(id);
		return new ProcessosDto (processos);
	}
	@PutMapping("/{id}")
	@CacheEvict(value = "Processos", allEntries = true)
	public ResponseEntity<ProcessosDto> atualiza(@PathVariable int id, int numeroprocesso, @RequestBody @Valid FormProcessos form){
		Processos processos=form.atualiza(id, numeroprocesso, processosRepository);
		return ResponseEntity.ok(new ProcessosDto(processos));
	}
	@DeleteMapping ("/{id}")
	@CacheEvict(value = "Processos", allEntries = true)
	public ResponseEntity<ProcessosDto> remove(@PathVariable int id, int numeroprocesso){
		processosRepository.deleteById(id);
		processosRepository.deleteByNroProcesso(numeroprocesso);
		return ResponseEntity.ok().build();
	}
}


