package projetofinal.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
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

import projetofinal.dto.UsuarioDto;
import projetofinal.form.FormUsuario;
import projetofinal.model.Usuario;
import projetofinal.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping("/aplication")
	@Transactional
	@CacheEvict(value = "lista de usuarios", allEntries = true)
	public ResponseEntity<UsuarioDto> cadastrar(@RequestBody @Valid FormUsuario form, UriComponentsBuilder uriBuilder) {
		Usuario user = form.converter(usuarioRepository);
		usuarioRepository.save(user);
		
		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).body(new UsuarioDto(user));
	}
	
	@GetMapping("/aplication")
	public List<UsuarioDto> lista(String nome){
		
		if(nome == null) {
			List<Usuario> usuario;
			
			usuario = usuarioRepository.findAll();
			
			return UsuarioDto.converter(usuario);
		}else {
			List<Usuario> usuario = usuarioRepository.findByNome(nome);
			return UsuarioDto.converter(usuario);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UsuarioDto> detalhar(@PathVariable Long id) {
		Optional<Usuario> topico = usuarioRepository.findById(id);
		if (topico.isPresent()) {
			return ResponseEntity.ok(new UsuarioDto(topico.get()));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaDeUsuario", allEntries = true)
	public ResponseEntity<UsuarioDto> atualizar(@PathVariable Long id, @RequestBody @Valid FormUsuario form) {
		Optional<Usuario> optional = usuarioRepository.findById(id);
		if (optional.isPresent()) {
			Usuario usuario = form.atualizar(id, usuarioRepository);
			return ResponseEntity.ok(new UsuarioDto(usuario));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaDeTopicos", allEntries = true)
	public ResponseEntity<?> remover(@PathVariable Long id) {
		Optional<Usuario> optional = usuarioRepository.findById(id);
		if (optional.isPresent()) {
			usuarioRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	}
}
