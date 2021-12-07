package projetofinal.model;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

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
	private LocalDate dataCriacao= LocalDate.now();
	private Integer nroProcesso;
	
	@ManyToOne
	private Documento documento;
	@ManyToOne
	private Usuario usuario;

	public Processos() {

	}

	public Processos(
			@NotNull @Min(1) Integer nroProcesso, 
			Status status2,
			@NotNull Cliente cliente,
			@NotNull Documento documento,
			@NotNull Usuario usuario, 
			 @NotNull LocalDate dataCriacao2) {

		this.nroProcesso = nroProcesso;
		this.cliente = cliente;
		this.documento = documento;
		this.usuario = usuario;
		this.dataCriacao=dataCriacao2;
		
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
		return nroProcesso;
	}

	public void setNroProcesso(Integer nroProcesso) {
		this.nroProcesso = 0;
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

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

}
