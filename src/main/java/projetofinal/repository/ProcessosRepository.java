package projetofinal.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import projetofinal.model.Processos;
import projetofinal.model.Status;


public interface ProcessosRepository extends JpaRepository <Processos,Integer>{
	
	Page<Processos> findByNroProcesso(int numeroprocesso, Pageable paginacao);
	
	Processos findById(int id);
	void deleteByNroProcesso(int numeroprocesso);

	Page<Processos> findByStatus(Status status, Pageable paginacao);
}