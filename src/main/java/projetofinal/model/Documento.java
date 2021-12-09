package projetofinal.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private int tipoDocumento;
	
	private String pathArquivo;
	
	private LocalDate dataUpload;
	
	private Long usuarioProprietario;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToOne
	private Processos processo;
	

	public Documento() {
	}

	public Documento(
			String nome, 
			int tipoDocumento, 
			String pathArquivo, 
			LocalDate dataUpload,
			Long usuarioProprietario,
			Usuario usuario,
			Processos processo) {
		this.nome = nome;
		this.tipoDocumento = tipoDocumento;
		this.pathArquivo = pathArquivo;
		this.dataUpload = dataUpload;
		this.usuarioProprietario = usuarioProprietario;
		this.usuario = usuario;
		this.processo = processo;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getPathArquivo() {
		return pathArquivo;
	}

	public void setPathArquivo(String pathArquivo) {
		this.pathArquivo = pathArquivo;
	}

	public LocalDate getDataUpload() {
		return dataUpload;
	}

	public void setDataUpload(LocalDate dataUpload) {
		this.dataUpload = dataUpload;
	}

	public Long getUsuarioProprietario() {
		return usuarioProprietario;
	}

	public void setUsuarioProprietario(Long usuarioProprietario) {
		this.usuarioProprietario = usuarioProprietario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Processos getProcesso() {
		return processo;
	}

	public void setProcesso(Processos processo) {
		this.processo = processo;
	}
 
}
