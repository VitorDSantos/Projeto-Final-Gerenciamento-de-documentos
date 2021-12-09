package projetofinal.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import projetofinal.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

	Optional<Documento> findById(Long id);

	
}
