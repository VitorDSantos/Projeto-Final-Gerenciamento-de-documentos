package projetofinal.form;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import projetofinal.model.Documento;
import projetofinal.model.Cliente;
import projetofinal.model.Processos;
import projetofinal.model.Status;
import projetofinal.model.Usuario;
import projetofinal.repository.ProcessosRepository;



public class FormProcessos {

	private int id;
	//@NotNull 
	private Cliente cliente;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	//@NotNull @NotEmpty 
	private String descricao;
	
	//@NotNull @NotEmpty
	private String nome;
	
	//@NotNull 
	private LocalDate dataCriacao= LocalDate.now();
	
//	@NotNull @Min(1)
	private Integer nroProcesso;
	

	private Documento documento;
	
	
	private Usuario usuario;
	
	public Processos converte(ProcessosRepository processosRepository) {
		List<Processos> processos= processosRepository.findAll();
		return new Processos (nroProcesso, status, cliente, documento, usuario, dataCriacao);
	}
	public Processos atualiza(int id, Integer numeroprocesso, ProcessosRepository processosRepository) {
		Processos processos = processosRepository.findById(id);
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

