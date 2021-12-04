package projetofinal.config.validacao;

public class ValidacaoFormDto {

	private String campo;
	private String erro;
	
	
	public ValidacaoFormDto(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}


	public String getCampo() {
		return campo;
	}


	public String getErro() {
		return erro;
	}
	
}
