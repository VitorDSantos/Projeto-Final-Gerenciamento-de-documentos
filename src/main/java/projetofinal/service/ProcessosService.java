package projetofinal.service;

import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import projetofinal.dto.ProcessosDto;
import projetofinal.model.Processos;
import projetofinal.model.Status;
import projetofinal.repository.ProcessosRepository;

@Service
public class ProcessosService {

		@Enumerated(EnumType.STRING)
		private Status status;
		@Autowired
		private ProcessosRepository processosRepository;
		private Processos processos;
		
		//int numeroprocesso = processos.getNroProcesso();
		
//		public List<ProcessosDto> filtrandoStatus(Status status) {
//			
//			if(status ==null) {
//				Page<Processos> processos = (Page<Processos>) processosRepository.findAll();
//				return ProcessosDto.converte(processos);
//			} else {
//			List<Processos> processos = processosRepository.findByStatus(status);
//			return ProcessosDto.converte(processos);}
//			}
			
		public List<ProcessosDto> filtrandoNro(int numeroProcesso) {
			Page<Processos> processosPage = processosRepository.findByNroProcesso(numeroProcesso, null);
			return ProcessosDto.converte(processosPage);
		}
		
}
