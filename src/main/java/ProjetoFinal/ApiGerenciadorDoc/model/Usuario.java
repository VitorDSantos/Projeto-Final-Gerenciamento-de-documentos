package ProjetoFinal.ApiGerenciadorDoc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer NumeroOAB;
	private String login;
	private int nro_processo;
	private String senha;
	@OneToMany
	private Cliente cliente;
	@ManyToOne
	private Processos processos;
	
	
	
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
	public int getNro_processo() {
		return nro_processo;
	}
	public void setNro_processo(int nro_processo) {
		this.nro_processo = nro_processo;
	}

}
