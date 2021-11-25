package ProjetoFinal.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer numeroOAB;
	private String login;
	private String senha;
	//@ManyToOne
	//private Cliente cliente;
	//@OneToMany
	//private Processos processos;
	
	public Usuario(
			@NotNull @NotEmpty 
			String nome, 
			@NotNull @NotEmpty 
			String login, 
			@NotNull @NotEmpty 
			String senha,
			@NotNull @NotEmpty 
			int numeroOAB) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.numeroOAB = numeroOAB;
	}
	

	public Usuario(@NotNull @NotEmpty String nome2, @NotNull @NotEmpty String login2, @NotNull @NotEmpty String senha2,
			@NotNull @NotEmpty int nroProcesso, @NotNull @NotEmpty int numeroOAB2) {
	
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




	
	}
	