package ProjetoFinal.controllers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ProjetoFinal.ApiGerenciadorDoc.model.Processos;
import ProjetoFinal.ApiGerenciadorDoc.model.Status;
import ProjetoFinal.controllers.dtos.ProcessosDto;
import ProjetoFinal.repositorios.ProcessosRepository;

public class ProcessosService {

		@Autowired
		Processos processos;
		@Autowired
		Status status;
		@Autowired
		private ProcessosRepository processosRepository;
		
		int nro_processos = processos.getNro_processo();		
		public List<ProcessosDto> filtrandoStatus(Status status) {
			if(status ==null) {
				List<Processos> processos = processosRepository.findAll();
				return ProcessosDto.converte(processos);
			} else {
			List<Processos> processos = processosRepository.findByStatus(status);
			return ProcessosDto.converte(processos);
		}
		
		}}
