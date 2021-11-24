package ProjetoFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProjetoFinal.dto.ProcessosDto;
import ProjetoFinal.model.Processos;
import ProjetoFinal.repository.ProcessosRepository;

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
