package ProjetoFinal.model;

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
	private Integer telefone;
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
	
	public Integer getTelefone() {
		return telefone;
	}
	
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public void setTelefone(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getNro_processo() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Documento getDocumento() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
