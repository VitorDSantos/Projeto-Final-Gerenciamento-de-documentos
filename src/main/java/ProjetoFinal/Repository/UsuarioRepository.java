package ProjetoFinal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjetoFinal.ApiGerenciadorDoc.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
