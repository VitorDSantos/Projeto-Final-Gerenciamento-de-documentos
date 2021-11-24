package ProjetoFinal.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import ProjetoFinal.model.Usuario;
<<<<<<< HEAD:src/main/java/ProjetoFinal/controllers/forms/FormUsuario.java
import ProjetoFinal.repositorios.UsuarioRepository;
=======
import ProjetoFinal.repository.UsuarioRepository;
>>>>>>> fe9b752f630558ac4003b65f7659b913a1affa1e:src/main/java/ProjetoFinal/form/FormUsuario.java


public class FormUsuario {
	@NotNull @NotEmpty
	private String nome;
	
	@NotNull @NotEmpty
	private String login;
	
	@NotNull @NotEmpty
	private String senha;
	
	@NotNull @NotEmpty
	private int nroProcesso;
	
	@NotNull @NotEmpty
	private int numeroOAB;
	
	public Usuario converter(UsuarioRepository usuarioRepository) {
		//Usuario usuario = usuarioRepository.findByNomes(nome);
		return new Usuario(nome, login, senha, numeroOAB);
	}

	public Usuario atualizar(Long id, UsuarioRepository usuarioRepository) {
		// TODO Auto-generated method stub
		return null;
	}
}
