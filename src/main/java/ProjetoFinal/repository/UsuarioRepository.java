package ProjetoFinal.repository;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjetoFinal.model.Processos;
import ProjetoFinal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	//List<Processos>findByNroProcesso(int nroProcesso);
	
	Processos findById(int id);
	
	List<Processos>findByNumeroOAB(Integer numeroOAB);
	
	List<Usuario>findByNome(String nome);

	//Usuario findByNomes(@NotNull @NotEmpty String nome);
}
