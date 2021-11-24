package ProjetoFinal.dto;

import java.time.LocalDate;

import ProjetoFinal.model.Documento;
import ProjetoFinal.model.Processos;
import ProjetoFinal.model.Usuario;

public class DocumentoDto {
	
	private long id;
	private String nome;
	private int tipoDocumento;
	private String pathArquivo;
	private LocalDate dataUpload;
	private Long usuarioProprietario;
	private Usuario usuario;
	private Processos processos;
	
	
	
	public DocumentoDto (Documento documento) {
		
		this.id=documento.getId();
		this.nome=documento.getNome();
		this.tipoDocumento=documento.getTipoDocumento();
		this.pathArquivo=documento.getPathArquivo();
		this.usuario=documento.getUsuario();
		this.dataUpload=documento.getDataUpload();
		this.usuarioProprietario=documento.getUsuarioProprietario();
		//this.processos=documento.getProcessos();
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
