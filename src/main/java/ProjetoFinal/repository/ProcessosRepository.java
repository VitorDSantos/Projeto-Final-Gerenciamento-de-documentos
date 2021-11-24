package ProjetoFinal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjetoFinal.model.Processos;

public interface ProcessosRepository extends JpaRepository <Processos,Integer>{
	
	List<Processos>findByNroProcesso(int nroProcesso);
	
	Processos findById(int id);

}
