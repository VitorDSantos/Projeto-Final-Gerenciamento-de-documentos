package ProjetoFinal.DTOs;

import java.util.Date;


import ProjetoFinal.ApiGerenciadorDoc.model.Cliente;
import ProjetoFinal.ApiGerenciadorDoc.model.Documento;
import ProjetoFinal.ApiGerenciadorDoc.model.Status;
import ProjetoFinal.ApiGerenciadorDoc.model.Usuario;

public class ProcessosDto {
	
	private int id;
	private Cliente cliente;
	private Status status;
	private String descricao;
	private String nome;
	private Date data_criacao;
	private int nro_processo;
	private Documento documentacao;
	private Usuario usuario;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData_criacao() {
		return data_criacao;
	}
	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}
	public int getNro_processo() {
		return nro_processo;
	}
	public void setNro_processo(int nro_processo) {
		this.nro_processo = nro_processo;
	}
	public Documento getDocumentacao() {
		return documentacao;
	}
	public void setDocumentacao(Documento documentacao) {
		this.documentacao = documentacao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	
	
	
	
}
