package projetofinal.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Processos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Cliente cliente;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	private String descricao;
	
	private String nome;
	
	private LocalDate dataCriacao = LocalDate.now();
	
	@Column(unique=true, length=8, nullable=false)
	private Integer nroProcesso;
	
	@OneToMany
	@JoinColumn(name="documento_id")
	private List<Documento> documento;
	
	@ManyToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;

	public Processos() {

	}

	public Processos(
			Integer nroProcesso, 
			Status status,
			Cliente cliente,
			Usuario usuario, 
			String descricao,
			String nome) {
		this.nroProcesso = nroProcesso;
		this.status = status;
		this.cliente = cliente;
		this.usuario = usuario;
		this.descricao = descricao;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public int getNroProcesso() {
		return this.nroProcesso;
	}

	public void setNroProcesso(Integer nroProcesso) {
		this.nroProcesso = nroProcesso;
	}

	public List<Documento> getDocumento() {
		return documento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getDataCriacao() {
		return this.dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public void setDocumento(List<Documento> documento) {
		this.documento = documento;
	}

	
}
