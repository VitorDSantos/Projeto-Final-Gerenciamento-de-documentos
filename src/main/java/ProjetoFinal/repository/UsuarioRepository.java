package ProjetoFinal.repository;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjetoFinal.model.Processos;
import ProjetoFinal.model.Usuario;
<<<<<<< HEAD:src/main/java/ProjetoFinal/repositorios/UsuarioRepository.java


=======
>>>>>>> fe9b752f630558ac4003b65f7659b913a1affa1e:src/main/java/ProjetoFinal/repository/UsuarioRepository.java

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	//List<Processos>findByNroProcesso(int nroProcesso);
	
	Processos findById(int id);
	
	List<Processos>findByNumeroOAB(Integer numeroOAB);
	
	List<Usuario>findByNome(String nome);

	//Usuario findByNomes(@NotNull @NotEmpty String nome);
}
