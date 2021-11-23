package ProjetoFinal.controllers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ProjetoFinal.ApiGerenciadorDoc.model.Processos;
import ProjetoFinal.controllers.dtos.ProcessosDto;
import ProjetoFinal.repositorios.ProcessosRepository;

public class ProcessosService {

		@Autowired
		Processos processos;
		
		@Autowired
		private ProcessosRepository processosRepository;
		public List<ProcessosDto> filtrandoNro(int nro_processos) {
			List<Processos> processos = processosRepository.findByNroProcessos(nro_processos);
			return ProcessosDto.converte(processos);
			
		}
}
