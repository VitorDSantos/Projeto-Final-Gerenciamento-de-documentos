package projetofinal.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import projetofinal.model.Processos;


public interface ProcessosRepository extends JpaRepository <Processos,Integer>{
	
	Page<Processos> findByNroProcesso(Integer nroProcesso, Pageable paginacao);
	

	List<Processos> findByNroProcesso(Integer nroProcesso);
	
	Processos getById(Integer id);
	
	void deleteByNroProcesso(Integer nroProcesso);

}