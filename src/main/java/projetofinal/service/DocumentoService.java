package projetofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetofinal.form.FormDocumento;
import projetofinal.model.Documento;
import projetofinal.repository.DocumentoRepository;

@Service
public class DocumentoService {

	@Autowired
	private DocumentoRepository documentoRepository;
	
	public void cadastrar(FormDocumento documentoForm) {
		
		Documento documento = new Documento();
		
		documento.setNome(documentoForm.getNome());
		documento.setDataUpload(documentoForm.getDataUpload());
		documento.setPathArquivo(documentoForm.getPathArquivo());
		documento.setTipoDocumento(documentoForm.getTipoDocumento());
		documento.setUsuarioProprietario(documentoForm.getUsuarioProprietario());
		
		documentoRepository.save(documento);
	}
	
}
