package ProjetoFinal.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import ProjetoFinal.model.Processos;
import ProjetoFinal.model.Status;


public interface ProcessosRepository extends JpaRepository <Processos,Integer>{
	
	Page<Processos> findByNroProcesso(int numeroprocesso, Pageable paginacao);
	
	Processos findById(int id);
	void deleteByNroProcesso(int numeroprocesso);

	Page<Processos> findByStatus(Status status, Pageable paginacao);
}