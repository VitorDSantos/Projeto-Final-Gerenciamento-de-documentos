package projetofinal.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import projetofinal.model.Cliente;
import projetofinal.model.Documento;
import projetofinal.model.Processos;
import projetofinal.model.Status;
import projetofinal.model.Usuario;

public class ProcessosDto {
	
	private Long id;
	private Cliente cliente;
	private Status status;
	private String descricao;
	private String nome;
	private Date dataCriacao;
	private int numeroprocesso;
	private Documento documento;
	private Usuario usuario;
	
	
	
	public ProcessosDto (Processos processos) {
		
		this.id=processos.getId();
		this.cliente=processos.getCliente();
		this.status=processos.getStatus();
		this.descricao=processos.getDescricao();
		this.nome=processos.getNome();
		this.dataCriacao =processos.getDataCriacao();
		this.numeroprocesso =processos.getNroProcesso();
		this.documento=processos.getDocumento();
		this.usuario=processos.getUsuario();
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
		return dataCriacao;
	}
	public void setData_criacao(Date data_criacao) {
		this.dataCriacao = data_criacao;
	}
	public int getNro_processo() {
		return numeroprocesso;
	}
	public void setNro_processo(int nro_processo) {
		this.numeroprocesso = nro_processo;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public static List<ProcessosDto> converte(Page<Processos> processos) {
		return processos.stream().map(ProcessosDto::new).collect(Collectors.toList());
	}
	
<<<<<<< HEAD
=======

	
	
	
>>>>>>> 62486b97da31780ee0630d73e56bb6c00cbc95c9
	
}
