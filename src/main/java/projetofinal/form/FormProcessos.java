package projetofinal.form;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import projetofinal.model.Cliente;
import projetofinal.model.Documento;
import projetofinal.model.Processos;
import projetofinal.model.Status;
import projetofinal.model.Usuario;
import projetofinal.repository.ProcessosRepository;

public class FormProcessos {

	private Cliente cliente;

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



	// public Processos converte(ProcessosRepository processosRepository) {
	// List<Processos> processos= processosRepository.findAll();
	// return new Processos (nroProcesso, status, cliente, documento, usuario);
	// }
	//public Processos atualiza(int id, Integer numeroprocesso, ProcessosRepository processosRepository) {
	//	Processos processos = processosRepository.findById(id);
	//	processos.setCliente(this.cliente);
		// processos.setDataCriacao(this.dataCriacao);
	//	processos.setDescricao(this.descricao);
	//	processos.setDocumento(this.documento);
	//	processos.setNome(this.nome);
	//	processos.setUsuario(this.usuario);
	//	processos.setStatus(this.status);
	//	return processos;
	//}

}
