package projetofinal.form;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import projetofinal.model.Usuario;
import projetofinal.repository.UsuarioRepository;


public class FormUsuario {
	
	@NotNull @NotEmpty
	private String nome;
	
	@NotNull @NotEmpty
	private String login;
	
	@NotNull @NotEmpty
	private String senha;
	
	private int nroProcesso;
	@NotNull @NotEmpty
	private Integer numeroOAB;
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setNroProcesso(int nroProcesso) {
		this.nroProcesso = nroProcesso;
	}
	public void setNumeroOAB(Integer numeroOAB) {
		this.numeroOAB = numeroOAB;
	}
	public Usuario converter(UsuarioRepository usuarioRepository) {
		List<Usuario> user = usuarioRepository.findByNome(nome);
		return new Usuario(login, nome,numeroOAB , senha);
	}
	public Usuario atualizar(Long id, UsuarioRepository usuarioRepository) {
		return null;
	}


	}

