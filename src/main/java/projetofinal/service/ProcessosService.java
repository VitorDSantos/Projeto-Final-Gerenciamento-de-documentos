package projetofinal.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetofinal.dto.ProcessosDto;
import projetofinal.form.FormProcessos;
import projetofinal.form.FormProcessosUpd;
import projetofinal.model.Processos;
import projetofinal.repository.DocumentoRepository;
import projetofinal.repository.ProcessosRepository;
import projetofinal.repository.UsuarioRepository;

@Service
public class ProcessosService {

	@Autowired
	private ProcessosRepository processosRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private DocumentoRepository documentoRepository;
	
	//@Autowired
	//private ClienteRepository clienteRepository;
	
	public void cadastrar(FormProcessos formProcessos) {
		Processos novoProcesso = new Processos();
		
		novoProcesso.setNome(formProcessos.getNome());
		novoProcesso.setDescricao(formProcessos.getDescricao());
		novoProcesso.setStatus(formProcessos.getStatus());
		novoProcesso.setNroProcesso(formProcessos.getNroProcesso());
		novoProcesso.setUsuario(usuarioRepository.getById(formProcessos.getUsuario()));
	
		processosRepository.save(novoProcesso);
	
	}
	
	
	@Transactional
	public boolean atualizar(Integer id, FormProcessosUpd form) {
		Optional<Processos> processoUpd = processosRepository.findById(id);
		
		if(processoUpd.isPresent()) {
			Processos proc = processoUpd.get();
			proc.setStatus(form.getStatus());
		} else {
			return false;
		}
		
		return true;
	}
	
	
	public List<ProcessosDto> listar() {
		List<Processos> processos;
		processos = processosRepository.findAll();
		return ProcessosDto.converte(processos);
	}
	
	
	public Optional<Processos> detalhar(Integer id) {
		return processosRepository.findById(id);
	}
	
	
	public void remover(Integer id) {
		processosRepository.deleteById(id);
	}
}
