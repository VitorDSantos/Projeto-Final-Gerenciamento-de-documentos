package ProjetoFinal.ApiGerenciadorDoc.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



public class Usuario {
	private Long id;
	private String nome;
	private Integer NumeroOAB;
	private String login;
	private String senha;
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
		return NumeroOAB;
	}
	public void setNumeroOAB(Integer numeroOAB) {
		NumeroOAB = numeroOAB;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Usuario(Long id, String nome, Integer numeroOAB, String login, String senha) {
		this.id = id;
		this.nome = nome;
		NumeroOAB = numeroOAB;
		this.login = login;
		this.senha = senha;
	}

	public Usuario() {
	}
	
	
}
