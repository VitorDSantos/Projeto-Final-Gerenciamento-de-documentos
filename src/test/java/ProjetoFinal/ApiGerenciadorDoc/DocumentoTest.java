package ProjetoFinal.ApiGerenciadorDoc;

import java.time.LocalDate;
import java.util.Date;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import projetofinal.model.Documento;
import projetofinal.model.Usuario;
import projetofinal.repository.DocumentoRepository;
import projetofinal.repository.UsuarioRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DocumentoTest {

	@Autowired(required=true)
	DocumentoRepository repository;

	
	@Test
	void testSaveDocumento() throws Exception {
		Documento documento = new Documento("Documento1",1,"docs/pdfs",null,null,null, null);
		this.repository.save(documento);
		
		Assertions.assertThat(documento.getId()).isNotNull();

		Assertions.assertThat(documento.getNome()).isEqualTo("Documento1");

		Assertions.assertThat(documento.getTipoDocumento()).isEqualTo(1);

		Assertions.assertThat(documento.getPathArquivo()).isEqualTo("docs/pdfs");

		Assertions.assertThat(documento.getId()).isEqualTo(2);
	}
}
