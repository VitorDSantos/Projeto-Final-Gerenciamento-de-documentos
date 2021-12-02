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
	private int id;
	private String nome;
	private String email;
<<<<<<< HEAD
	private long telefone;
=======
	private Integer telefone;
>>>>>>> 62486b97da31780ee0630d73e56bb6c00cbc95c9
	@ManyToOne
	private Usuario usuario;
	

	public Cliente() {
	}
	
	public Cliente(int id, String nome, String email, Integer telefone, Usuario usuario) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
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
	
<<<<<<< HEAD
	public long getTelefone() {
		return telefone;
	}
	
	public void setTelefone(long telefone) {
=======
	public Integer getTelefone() {
		return telefone;
	}
	
	public void setTelefone(Integer telefone) {
>>>>>>> 62486b97da31780ee0630d73e56bb6c00cbc95c9
		this.telefone = telefone;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public void setTelefone(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getNro_processo() {
		return 0;
	}

	public Documento getDocumento() {
		return null;
	}
	
}
