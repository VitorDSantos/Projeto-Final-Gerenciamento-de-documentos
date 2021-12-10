package projetofinal.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetofinal.dto.UsuarioDto;
import projetofinal.form.FormUsuario;
import projetofinal.model.Usuario;
import projetofinal.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public void cadastrar(FormUsuario formUsuario) {

		Usuario cadastroUser = new Usuario();

		cadastroUser.setNome(formUsuario.getNome());
		cadastroUser.setLogin(formUsuario.getLogin());
		cadastroUser.setSenha(formUsuario.getSenha());
		cadastroUser.setNumeroOAB(formUsuario.getNumeroOAB());
		
		usuarioRepository.save(cadastroUser);
	}

	@Transactional
	public void atualizar(Long id, FormUsuario formUsuario) {

		Usuario atualizarUser = usuarioRepository.getById(id);

		atualizarUser.setNome(formUsuario.getNome());
		atualizarUser.setLogin(formUsuario.getLogin());
		atualizarUser.setSenha(formUsuario.getSenha());
		atualizarUser.setNumeroOAB(formUsuario.getNumeroOAB());

	}

	public List<UsuarioDto> listar() {
		List<Usuario> users;
		users = usuarioRepository.findAll();
		return UsuarioDto.converter(users);
	}

	public UsuarioDto detalhar(Long id) {
		Usuario usuarios = usuarioRepository.getById(id);
		UsuarioDto usuarioDto = new UsuarioDto();
		
		usuarioDto.setId(usuarios.getId());
		usuarioDto.setNome(usuarios.getNome());
		usuarioDto.setLogin(usuarios.getLogin());
		usuarioDto.setSenha(usuarios.getSenha());
		usuarioDto.setNumeroOAB(usuarios.getNumeroOAB());
		
		return usuarioDto;
		
	}

	public void remover(Long id) {
		usuarioRepository.deleteById(id);
	}
}
