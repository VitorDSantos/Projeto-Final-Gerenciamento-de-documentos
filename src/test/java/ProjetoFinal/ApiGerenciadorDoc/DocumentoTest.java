package ProjetoFinal.ApiGerenciadorDoc;

import java.time.LocalDate;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import projetofinal.model.Documento;
import projetofinal.repository.DocumentoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DocumentoTest {

	@Autowired(required=true)
	DocumentoRepository repository;


	@Test
	@DisplayName("Deveria Salvar Um Documento")
	void deveriaSalvarDocumento(){

		Documento documento = new Documento("Documento1",1,"docs/pdfs",LocalDate.now(),(long) 1,null, null);

		this.repository.save(documento);
		
		Assertions.assertThat(documento.getId()).isNotNull();

		Assertions.assertThat(documento.getNome()).isEqualTo("Documento1");

		Assertions.assertThat(documento.getTipoDocumento()).isEqualTo(1);

		Assertions.assertThat(documento.getUsuarioProprietario()).isEqualTo(1);
		
		Assertions.assertThat(documento.getPathArquivo()).isEqualTo("docs/pdfs");

		Assertions.assertThat(documento.getId()).isEqualTo(4);
		
		Assertions.assertThat(documento.getDataUpload()).isEqualTo(LocalDate.now());
	}


	@DisplayName("Deveria atualizar um documento")
	@Test
	void deveriaAtualizarDocumento(){
		Documento documento = new Documento("Documento1",1,"docs/pdfs",null,(long) 1,null,null);
		this.repository.save(documento);
		
		documento.setNome("Doc1");
		documento.setTipoDocumento(2);
		documento.setPathArquivo("docs/arquivos");
		documento.setUsuarioProprietario((long) 2);
		
		
		Assertions.assertThat(documento.getId()).isNotNull();

		Assertions.assertThat(documento.getNome()).isEqualTo("Doc1");

		Assertions.assertThat(documento.getTipoDocumento()).isEqualTo(2);

		Assertions.assertThat(documento.getUsuarioProprietario()).isEqualTo(2);

		Assertions.assertThat(documento.getPathArquivo()).isEqualTo("docs/arquivos");

		Assertions.assertThat(documento.getId()).isEqualTo(5);
	}
	
	@DisplayName("Deveria deletar um documento")
	@Test
	void deveriaDeletarDocumento() {
		Documento doc = new Documento("Documento1",1,"docs/pdfs",null,(long) 1,null,null);
		this.repository.save(doc);
		Long id = doc.getId();
		repository.deleteById(id);
		Assertions.assertThat(repository.findById(doc.getId())).isEmpty();
		
		
	}

	@DisplayName("Deveria procurar um documento pelo id")
	@Test
	void testeDocProcuraPorId(){
		Documento doc = new Documento("Documento1",1,"docs/pdfs",null,(long) 1,null,null);
		this.repository.save(doc);
		
		Long id = doc.getId();
		Optional<Documento> ids = repository.findById(id);
		Assertions.assertThat(ids).isNotEmpty();

	}
}
