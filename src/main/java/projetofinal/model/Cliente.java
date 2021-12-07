package projetofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	private Processos processos;
	public Processos getProcessos() {
		return processos;
	}

	public void setProcessos(Processos processos) {
		this.processos = processos;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setNroProcesso(Integer nroProcesso) {
	}

	public Cliente() {
	}
	
	public Cliente(Integer id, String nome, String email, Integer telefone, Usuario usuario, Integer nroProcesso) {
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

	public int getNroProcesso() {
		return 0;
	}

	public Documento getDocumento() {
		return null;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	
}
