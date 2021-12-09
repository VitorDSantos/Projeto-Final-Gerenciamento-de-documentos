package projetofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetofinal.dto.ProcessosDto;
import projetofinal.form.FormProcessos;
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
	
	
	//@Transactional
	//public void atualizar() {
		
	//}
	
	
	public List<ProcessosDto> listar() {
		List<Processos> processos;
		processos = processosRepository.findAll();
		return ProcessosDto.converte(processos);
	}
	
	
	//public ProcessosDto detalhar(Integer id) {
	//	Optional<Processos> processo = processosRepository.findById(id);
	//}
	
	
	public void remover(Integer id) {
		processosRepository.deleteById(id);
	}
}
