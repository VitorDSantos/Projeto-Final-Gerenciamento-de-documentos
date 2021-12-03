package projetofinal.dto;

import java.util.List;
import java.util.stream.Collectors;

import projetofinal.model.Usuario;


public class UsuarioDto {
	private Long id;
	private String nome;
	private int numeroOAB;
	private String login;
	private int nProcesso;
	private String senha;
	
	public UsuarioDto (Usuario usuario) {
		
		this.id=usuario.getId();
		this.nome = usuario.getNome();
		this.numeroOAB = usuario.getNumeroOAB();
		this.login = usuario.getLogin();
		//this.nProcesso = usuario.getNroProcesso();
		this.senha = usuario.getSenha();
	}

	public UsuarioDto() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroOAB() {
		return numeroOAB;
	}

	public void setNumeroOAB(int numeroOAB) {
		this.numeroOAB = numeroOAB;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getNroProcesso() {
		return nProcesso;
	}

	public void setNroProcesso(int nprocesso) {
		this.nProcesso = nprocesso;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public static List<UsuarioDto> converter(List<Usuario> usuario) {
		 
		return usuario.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}
}
