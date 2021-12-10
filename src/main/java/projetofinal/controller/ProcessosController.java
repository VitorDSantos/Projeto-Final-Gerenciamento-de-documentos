package projetofinal.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetofinal.dto.ProcessosDto;
import projetofinal.form.FormProcessos;
import projetofinal.form.FormProcessosUpd;
import projetofinal.model.Processos;
import projetofinal.service.ProcessosService;

@RestController
@RequestMapping("/api/processos")
public class ProcessosController {

	@Autowired
	private ProcessosService processosService;

	@PostMapping
	@CacheEvict(value = "Processos", allEntries = true)
	public ResponseEntity<String> inserir(@RequestBody @Valid FormProcessos form) {
		processosService.cadastrar(form);
		return new ResponseEntity<>("Processo adicionado", HttpStatus.CREATED);
	}
	
	
	@GetMapping
	@Cacheable(value="Processos")
	public List<ProcessosDto> listar() { 
		return processosService.listar();
	}
	

	@GetMapping("/{id}")
	public Optional<Processos> detalhar(@PathVariable Integer id) {
		return processosService.detalhar(id);
	}

	
	@PutMapping("/{id}")
	@CacheEvict(value = "Processos", allEntries = true)
	public ResponseEntity<String> atualiza(@PathVariable Integer id, @RequestBody @Valid FormProcessosUpd form){
		if(!processosService.atualizar(id, form)) {
			return ResponseEntity.badRequest().body("Processo não encontrado.");
		}
		return ResponseEntity.ok("Processo atualizado");
	}
	

	@DeleteMapping("/{id}")
	@CacheEvict(value = "Processos", allEntries = true)
	public ResponseEntity<String> remove(@PathVariable Integer id) {
		processosService.remover(id);
		return ResponseEntity.ok("Processo com id "+id+" foi removido.");
	}
}
