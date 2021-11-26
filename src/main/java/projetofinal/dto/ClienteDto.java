package projetofinal.dto;

import projetofinal.model.Cliente;
import projetofinal.model.Documento;

public class ClienteDto {
	private int id;
	private String nome;
	private String email;
	private Integer telefone;
	private int nro_processo;
	private Documento documento;
	
	
	public ClienteDto (Cliente cliente) {
		
		this.id= cliente.getId();
		this.nome= cliente.getNome();
		this.email= cliente.getEmail();
		this.telefone= cliente.getTelefone();
		//this.nro_processo= cliente.getNroProcesso();
		//this.documento= cliente.getDocumento();
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


	public int getNro_processo() {
		return nro_processo;
	}


	public void setNro_processo(int nro_processo) {
		this.nro_processo = nro_processo;
	}


	//public Documento getDocumento() {
	//	return documento;
	//}


	//public void setDocumento(Documento documento) {
	//	this.documento = documento;
	//}
	
	
	
}
