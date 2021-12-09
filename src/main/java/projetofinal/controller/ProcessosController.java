package projetofinal.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetofinal.form.FormProcessos;
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
	
	/*
	@GetMapping
	@Cacheable(value = "Processo")
	public List<ProcessosDto> listar(){
			int quantidade) { // depois adicionar por status
		Pageable paginacao = PageRequest.of(pag, quantidade);
		Page<Processos> processosPage = processosRepository.findByNroProcesso(numeroprocesso, paginacao);
		return ProcessosDto.converte(processosPage);
	}*/
	

	/*
	@GetMapping("/{id}")
	public ProcessosDto detalha(@PathVariable int id) {
		Processos processos = processosRepository.findById(id);
		return new ProcessosDto(processos);
	}

	@PutMapping("/{id}")
	@CacheEvict(value = "Processos", allEntries = true)
	public ResponseEntity<ProcessosDto> atualiza(@PathVariable int id, Integer numeroprocesso,
			@RequestBody @Valid FormProcessos form) {
		Processos processos = form.atualiza(id, numeroprocesso, processosRepository);
		return ResponseEntity.ok(new ProcessosDto(processos));
	}

	@DeleteMapping("/{id}")
	@CacheEvict(value = "Processos", allEntries = true)
	public ResponseEntity<ProcessosDto> remove(@PathVariable int id, Integer numeroprocesso) {
		processosRepository.deleteById(id);
		processosRepository.deleteByNroProcesso(numeroprocesso);
		return ResponseEntity.ok().build();
	}*/
}
