package projetofinal.form;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import projetofinal.model.Status;

public class FormProcessos {

	@NotNull
	@Enumerated(EnumType.STRING)
	private Status status;

	@NotNull
	@NotEmpty
	private String descricao;

	@NotNull
	@NotEmpty
	private String nome;

	@NotNull
	@Min(1)
	private Integer nroProcesso;

	private Long documento;

	private Long usuario;

	private Integer cliente;
	
	
	public Integer getCliente() {
		return cliente;
	}



	public void setCliente(Integer cliente) {
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



	public Integer getNroProcesso() {
		return nroProcesso;
	}



	public void setNroProcesso(Integer nroProcesso) {
		this.nroProcesso = nroProcesso;
	}



	public Long getDocumento() {
		return documento;
	}



	public void setDocumento(Long documento) {
		this.documento = documento;
	}



	public Long getUsuario() {
		return usuario;
	}



	public void setUsuario(Long usuario) {
		this.usuario = usuario;
	}

}
