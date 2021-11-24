package ProjetoFinal.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import ProjetoFinal.model.Cliente;
import ProjetoFinal.model.Documento;
import ProjetoFinal.model.Processos;

import ProjetoFinal.model.Cliente;
import ProjetoFinal.model.Documento;
import ProjetoFinal.model.Processos;
import ProjetoFinal.model.Status;
import ProjetoFinal.model.Usuario;

public class ProcessosDto {
	
	private Long id;
	private Cliente cliente;
	private Status status;
	private String descricao;
	private String nome;
	private Date data_criacao;
	private int nro_processo;
	private Documento documento;
	private Usuario usuario;
	
	
	
	public ProcessosDto (Processos processos) {
		
		this.id=processos.getId();
		this.cliente=processos.getCliente();
		this.status=processos.getStatus();
		this.descricao=processos.getDescricao();
		this.nome=processos.getNome();
		this.data_criacao=processos.getDataCriacao();
		this.nro_processo=processos.getNroProcesso();
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


	public static List<ProcessosDto> converte(List<Processos> processos) {
		return processos.stream().map(ProcessosDto::new).collect(Collectors.toList());
	}
	

	
	
	
	
}
