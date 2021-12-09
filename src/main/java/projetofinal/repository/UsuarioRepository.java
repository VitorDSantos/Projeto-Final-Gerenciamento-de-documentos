package projetofinal.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import projetofinal.model.Processos;
import projetofinal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	List<Usuario>findByNumeroOAB(Integer numeroOAB);
	
	List<Usuario>findByNome(String nome);
	
	Optional<Usuario> findByLogin(String login);

}
