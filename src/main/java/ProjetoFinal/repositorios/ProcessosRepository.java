package ProjetoFinal.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjetoFinal.ApiGerenciadorDoc.model.Processos;

public interface ProcessosRepository extends JpaRepository <Processos,Integer>{
	
	List<Processos>findByNroProcessos(int nro_processo);
	
	Processos findById(int id);
}
