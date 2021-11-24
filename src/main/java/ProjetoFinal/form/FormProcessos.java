package ProjetoFinal.form;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import ProjetoFinal.model.Documento;
import ProjetoFinal.model.Processos;
import ProjetoFinal.model.Status;
import ProjetoFinal.model.Usuario;
import ProjetoFinal.repository.ProcessosRepository;



public class FormProcessos {
	
	@NotNull @NotEmpty
	private ProjetoFinal.model.Cliente cliente;
	
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
		Processos processos = (Processos) processosRepository.findByNroProcesso(nro_processo);
		return new Processos (nro_processo, status, cliente, documento, usuario, data_criacao);
	}
	public Processos atualiza(int id, int nro_processos, ProcessosRepository processosRepository) {
		Processos processos = processosRepository.getOne(id);
		processos.setCliente(this.cliente);
		processos.setDataCriacao(this.data_criacao);
		processos.setDescricao(this.descricao);
		processos.setDocumento(this.documento);
		processos.setNome(this.nome);
		processos.setUsuario(this.usuario);
		processos.setStatus(this.status);
		return processos;
	}

	
	}

