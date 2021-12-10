package projetofinal.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private String email;
	
	private long telefone;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToMany
	@JoinColumn(name="cliente_id")
	private List<Processos> processos;
	
	
	public Cliente() {
	
	}
	
	public Cliente(Integer id, String nome, String email, Integer telefone, Usuario usuario) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.setTelefone(telefone);
		this.usuario = usuario;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public void setTelefone(Usuario usuario) {
		this.usuario = usuario;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public List<Processos> getProcessos() {
		return processos;
	}

	public void setProcessos(List<Processos> processos) {
		this.processos = processos;
	}
	
}
