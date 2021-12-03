package projetofinal.form;

import java.time.LocalDate;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class FormDocumento {

	@NotNull @NotEmpty @Length(min = 2)
	private String nome;
	
	@NotNull
	private int tipoDocumento;

	@NotNull @NotEmpty @Length(min=3)
	private String pathArquivo;
	
	@NotNull
	private LocalDate dataUpload;
	
	@NotNull
	private Long usuarioProprietario;
	
	@NotNull
	private Long usuarioId;

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

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}
	
}
