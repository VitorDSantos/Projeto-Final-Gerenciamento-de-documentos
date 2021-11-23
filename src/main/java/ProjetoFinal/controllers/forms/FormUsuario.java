package ProjetoFinal.controllers.forms;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import ProjetoFinal.ApiGerenciadorDoc.model.Usuario;
import ProjetoFinal.repositorios.UsuarioRepository;


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
		Usuario usuario = usuarioRepository.findByNomes(nome);
		return new Usuario(nome, login, senha, nroProcesso, numeroOAB);
	}
}
