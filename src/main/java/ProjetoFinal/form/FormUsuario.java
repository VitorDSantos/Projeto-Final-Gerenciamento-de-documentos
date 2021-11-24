package ProjetoFinal.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import ProjetoFinal.model.Usuario;
import ProjetoFinal.repository.UsuarioRepository;


public class FormUsuario {
	@NotNull @NotEmpty
	private String nome;
	
	@NotNull @NotEmpty
	private String login;
	
	@NotNull @NotEmpty
	private String senha;
	
	@NotNull @NotEmpty
	private int nroProcesso;
	
	@NotNull @NotEmpty
	private int numeroOAB;
	
	public Usuario converter(UsuarioRepository usuarioRepository) {
		Usuario usuario = (Usuario) usuarioRepository.findByNome(nome);
		return new Usuario(nome, login, senha, nroProcesso, numeroOAB);
	}
	public Usuario atualizar(Long id, UsuarioRepository usuarioRepository) {
		return null;
	}
}
