package ProjetoFinal.ApiGerenciadorDoc;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import projetofinal.repository.DocumentoRepository;
import projetofinal.service.DocumentoService;

@AutoConfigureMockMvc
public class DocumentoServiceTest {

	@MockBean
	private DocumentoRepository documentoRepository;
	
	@Autowired
	private DocumentoService service;
	
	@Test
	public void test(){
		System.out.println("ok");
	}

}
