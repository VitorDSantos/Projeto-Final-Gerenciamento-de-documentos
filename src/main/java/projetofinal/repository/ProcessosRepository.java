package projetofinal.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import projetofinal.model.Processos;


public interface ProcessosRepository extends JpaRepository <Processos,Integer>{
	
	Page<Processos> findByNroProcesso(Integer nroProcesso, Pageable paginacao);
	
	Processos findById(int id);
	void deleteByNroProcesso(Integer nroProcesso);

//	Page<Processos> findByStatus(Status status, Pageable paginacao);

}