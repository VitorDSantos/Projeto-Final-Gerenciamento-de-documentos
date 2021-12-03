package projetofinal.dto;

import projetofinal.model.Usuario;

public class DetalharUsuarioDto {
	private Long id;
	private String nome;
	private Integer numeroOAB;
	private String login;
	private int nProcesso;
	private String senha;
	
	public DetalharUsuarioDto (Usuario usuario) {
		
		this.id=usuario.getId();
		this.nome = usuario.getNome();
		this.numeroOAB = usuario.getNumeroOAB();
		this.login = usuario.getLogin();
//		this.nProcesso = usuario.getNroProcesso();
		this.senha = usuario.getSenha();
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

	public void setNumeroOAB(Integer numeroOAB) {
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

	public void setNroProcesso(int nro_processo) {
		this.nProcesso = nro_processo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
