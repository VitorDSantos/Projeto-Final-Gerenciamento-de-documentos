package projetofinal.model;

import java.time.LocalDate;

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
	//private Processos processos;
	

	public Documento() {
	}

	public Documento(
			String nome, 
			int tipoDocumento, 
			String pathArquivo, 
			LocalDate dataUpload,
			Long usuarioProprietario) {
		this.nome = nome;
		this.tipoDocumento = tipoDocumento;
		this.pathArquivo = pathArquivo;
		this.dataUpload = dataUpload;
		this.usuarioProprietario = usuarioProprietario;
	}

	public long getId() {
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

	//public Processos getProcessos() {
	//	return processos;
	//}

	//public void setProcessos(Processos processos) {
	//	this.processos = processos;
	//}

	
	
	
}
