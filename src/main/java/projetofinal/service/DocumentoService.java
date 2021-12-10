package projetofinal.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetofinal.dto.DocumentoDto;
import projetofinal.form.FormDocumento;
import projetofinal.model.Documento;
import projetofinal.repository.DocumentoRepository;
import projetofinal.repository.ProcessosRepository;

@Service
public class DocumentoService {

	@Autowired
	private DocumentoRepository documentoRepository;
	
	@Autowired
	private ProcessosRepository processoRepository;

	public void cadastrar(FormDocumento documentoForm) {

		Documento cadastrarDocumento = new Documento();

		cadastrarDocumento.setNome(documentoForm.getNome());
		cadastrarDocumento.setDataUpload(documentoForm.getDataUpload());
		cadastrarDocumento.setPathArquivo(documentoForm.getPathArquivo());
		cadastrarDocumento.setTipoDocumento(documentoForm.getTipoDocumento());
		cadastrarDocumento.setUsuarioProprietario(documentoForm.getUsuarioProprietario());
		cadastrarDocumento.setProcesso(processoRepository.getById(documentoForm.getProcessoId()));

		documentoRepository.save(cadastrarDocumento);
	}

	@Transactional
	public void atualizar(Long id, FormDocumento documentoForm) {

		Documento atualizarDocumento = documentoRepository.getById(id);

		atualizarDocumento.setNome(documentoForm.getNome());
		atualizarDocumento.setUsuarioProprietario(documentoForm.getUsuarioProprietario());

	}

	public List<DocumentoDto> listar() {
		List<Documento> documentos;
		documentos = documentoRepository.findAll();
		return DocumentoDto.converter(documentos);
	}

	public DocumentoDto detalhar(Long id) {
		Documento documento = documentoRepository.getById(id);
		DocumentoDto documentoDto = new DocumentoDto();
		
		documentoDto.setId(documento.getId());
		documentoDto.setNome(documento.getNome());
		documentoDto.setPathArquivo(documento.getPathArquivo());
		documentoDto.setDataUpload(documento.getDataUpload());
		documentoDto.setTipoDocumento(documento.getTipoDocumento());
		documentoDto.setUsuarioProprietario(documento.getUsuarioProprietario());
		
		return documentoDto;
		
	}

	public void remover(Long id) {
		documentoRepository.deleteById(id);
	}
}
