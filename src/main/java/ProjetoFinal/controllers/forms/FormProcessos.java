package ProjetoFinal.controllers.forms;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import ProjetoFinal.ApiGerenciadorDoc.model.Cliente;
import ProjetoFinal.ApiGerenciadorDoc.model.Documento;
import ProjetoFinal.ApiGerenciadorDoc.model.Processos;
import ProjetoFinal.ApiGerenciadorDoc.model.Status;
import ProjetoFinal.ApiGerenciadorDoc.model.Usuario;
import ProjetoFinal.repositorios.ProcessosRepository;

public class FormProcessos {
	
	@NotNull @NotEmpty
	private Cliente cliente;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	@NotNull @NotEmpty 
	private String descricao;
	@NotNull @NotEmpty
	private String nome;
	@NotNull @NotEmpty
	private Date data_criacao;
	@NotNull @NotEmpty @Length(min=2)
	private int nro_processo;
	@NotNull @NotEmpty
	private Documento documento;
	@NotNull @NotEmpty
	private Usuario usuario;
	
	public Processos converte(ProcessosRepository processosRepository) {
		Processos processos = (Processos) processosRepository.findByNroProcessos(nro_processo);
		return new Processos (nro_processo, status, cliente, documento, usuario, data_criacao);
	}
	public Processos atualiza(int id, int nro_processos, ProcessosRepository processosRepository) {
		Processos processos = processosRepository.getOne(id);
		processos.setCliente(this.cliente);
		processos.setData_criacao(this.data_criacao);
		processos.setDescricao(this.descricao);
		processos.setDocumento(this.documento);
		processos.setNome(this.nome);
		processos.setUsuario(this.usuario);
		processos.setStatus(this.status);
		return processos;
	}

	
	}

