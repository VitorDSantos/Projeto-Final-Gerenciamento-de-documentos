package ProjetoFinal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ProjetoFinal.model.Processos;
<<<<<<< HEAD:src/main/java/ProjetoFinal/repositorios/ProcessosRepository.java

=======
>>>>>>> fe9b752f630558ac4003b65f7659b913a1affa1e:src/main/java/ProjetoFinal/repository/ProcessosRepository.java

public interface ProcessosRepository extends JpaRepository <Processos,Integer>{
	
	List<Processos>findByNroProcesso(int nroProcesso);
	
	Processos findById(int id);

}
