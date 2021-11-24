package ProjetoFinal.ApiGerenciadorDoc.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Processos {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Cliente cliente;
	@Enumerated(EnumType.STRING)
	private Status status;
	private String descricao;
	private String nome;
	private Date data_criacao;
	private int nro_processo;
	@OneToOne
	private Documento documento;
	@ManyToOne
	private Usuario usuario;
	
	public Processos (int nro_processo) {
		
	}
	
public Processos (@NotNull @NotEmpty @Length(min = 2) int nro_processo2, Status status2, @NotNull @NotEmpty Cliente cliente2, @NotNull @NotEmpty Documento documento2, @NotNull @NotEmpty Usuario usuario2, @NotNull @NotEmpty Date data_criacao2) {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	
	
	
		
}
