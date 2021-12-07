package ProjetoFinal.ApiGerenciadorDoc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.google.common.base.Optional;

import projetofinal.model.Documento;
import projetofinal.repository.DocumentoRepository;
import projetofinal.service.DocumentoService;

class testes {

	@MockBean
	private DocumentoRepository documentoRepository;
	
	@Autowired
	private DocumentoService service;
	
	@Test
	@DisplayName("deve remover doc")
	public void deveRemoverDoc() {
		Long docs = (long) 1;
		
		service.remover(docs);
		
	}
	private Documento documentos() {
		Documento d = Mockito.mock(Documento.class);
		return d;
	}
	
	
	
}
