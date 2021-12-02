package projetofinal.form;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import projetofinal.model.Documento;
<<<<<<< HEAD
import projetofinal.model.Cliente;
=======
>>>>>>> 62486b97da31780ee0630d73e56bb6c00cbc95c9
import projetofinal.model.Processos;
import projetofinal.model.Status;
import projetofinal.model.Usuario;
import projetofinal.repository.ProcessosRepository;



public class FormProcessos {

	private int id;
<<<<<<< HEAD
	//@NotNull @NotEmpty
	private Cliente cliente;
=======
	@NotNull @NotEmpty
	private projetofinal.model.Cliente cliente;
>>>>>>> 62486b97da31780ee0630d73e56bb6c00cbc95c9
	@Enumerated(EnumType.STRING)
	private Status status;
	@NotNull @NotEmpty 
	private String descricao;
	@NotNull @NotEmpty
	private String nome;
	@NotNull @NotEmpty
	private Date dataCriacao;
	@NotNull @NotEmpty @Length(min=2)
	private int numeroprocesso;
<<<<<<< HEAD
	//@NotNull @NotEmpty
	private Documento documento;
	//@NotNull @NotEmpty
=======
	@NotNull @NotEmpty
	private Documento documento;
	@NotNull @NotEmpty
>>>>>>> 62486b97da31780ee0630d73e56bb6c00cbc95c9
	private Usuario usuario;
	
	public Processos converte(ProcessosRepository processosRepository) {
		Processos processos = (Processos) processosRepository.findById(id);
		return new Processos (numeroprocesso, status, cliente, documento, usuario, dataCriacao);
	}
	public Processos atualiza(int id, int nro_processos, ProcessosRepository processosRepository) {
		Processos processos = processosRepository.getOne(id);
		processos.setCliente(this.cliente);
		processos.setDataCriacao(this.dataCriacao);
		processos.setDescricao(this.descricao);
		processos.setDocumento(this.documento);
		processos.setNome(this.nome);
		processos.setUsuario(this.usuario);
		processos.setStatus(this.status);
		return processos;
	}

	
	}

