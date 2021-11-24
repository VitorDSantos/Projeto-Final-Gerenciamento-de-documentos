package ProjetoFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD:src/main/java/ProjetoFinal/controllers/service/ProcessosService.java
import ProjetoFinal.controllers.dtos.ProcessosDto;
import ProjetoFinal.model.Processos;
import ProjetoFinal.repositorios.ProcessosRepository;
=======
import ProjetoFinal.dto.ProcessosDto;
import ProjetoFinal.model.Processos;
import ProjetoFinal.repository.ProcessosRepository;
>>>>>>> fe9b752f630558ac4003b65f7659b913a1affa1e:src/main/java/ProjetoFinal/service/ProcessosService.java

@Service
public class ProcessosService {

		//@Autowired
		//Processos processos;
		
		@Autowired
		private ProcessosRepository processosRepository;
		
		public List<ProcessosDto> filtrandoNro(int nro_processos) {
			List<Processos> processos = processosRepository.findByNroProcesso(nro_processos);
			return ProcessosDto.converte(processos);
			
		}
}
