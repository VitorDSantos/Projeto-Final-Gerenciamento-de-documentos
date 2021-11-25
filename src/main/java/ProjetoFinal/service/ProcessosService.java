package ProjetoFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import ProjetoFinal.dto.ProcessosDto;
import ProjetoFinal.model.Processos;
import ProjetoFinal.model.Status;
import ProjetoFinal.repository.ProcessosRepository;

@Service
public class ProcessosService {

		@Autowired
		Processos processos;
		@Autowired
		Status status;
		@Autowired
		private ProcessosRepository processosRepository;
		
		int numeroprocesso = processos.getNroProcesso();
		
//		public List<ProcessosDto> filtrandoStatus(Status status) {
//			
//			if(status ==null) {
//				Page<Processos> processos = (Page<Processos>) processosRepository.findAll();
//				return ProcessosDto.converte(processos);
//			} else {
//			List<Processos> processos = processosRepository.findByStatus(status);
//			return ProcessosDto.converte(processos);}
//			}
			
		public List<ProcessosDto> filtrandoNro(int numeroprocesso) {
			Page<Processos> processos = processosRepository.findByNroProcesso(numeroprocesso, null);
			return ProcessosDto.converte(processos);
		}
		
		}
