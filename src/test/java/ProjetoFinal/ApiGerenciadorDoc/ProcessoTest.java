package ProjetoFinal.ApiGerenciadorDoc;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import projetofinal.model.Processos;
import projetofinal.repository.ProcessosRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProcessoTest {

	@Autowired(required=true)
	ProcessosRepository repository;

	
	@Test
	void testSaveProcesso(){
		Processos processo = new Processos(1, null,null, null, "processo do vitor", "processo1");
		this.repository.save(processo);
		
		Assertions.assertThat(processo.getId()).isNotNull();
		Assertions.assertThat(processo.getNome()).isEqualTo("processo1");
		Assertions.assertThat(processo.getDescricao()).isEqualTo("processo do vitor");
		Assertions.assertThat(processo.getNroProcesso()).isEqualTo(1);
		Assertions.assertThat(processo.getId()).isEqualTo(3);
	}

	@Test
	void testUpdateProcesso(){
		Processos processo = new Processos(1, null,null, null, "processo do vitor", "processo1");
		this.repository.save(processo);
		
		processo.setNome("p2");
		processo.setNroProcesso(2);
		processo.setDescricao("processo 2");
		
		
		Assertions.assertThat(processo.getId()).isNotNull();
		Assertions.assertThat(processo.getNome()).isEqualTo("p2");
		Assertions.assertThat(processo.getDescricao()).isEqualTo("processo 2");
		Assertions.assertThat(processo.getNroProcesso()).isEqualTo(2);
		Assertions.assertThat(processo.getId()).isEqualTo(1);
	}
	@Test
	void testeDeletePorcesso() {
		Processos processo = new Processos(1, null,null, null, "processo do vitor", "processo1");
		this.repository.save(processo);
		Integer id = processo.getId();
		repository.deleteById(id);
		Assertions.assertThat(repository.findById(processo.getId())).isEmpty();
		
		
	}
	@Test
	void testeProcessoProcuraPorId(){
		Processos processo = new Processos(1, null,null, null, "processo do vitor", "processo1");
		this.repository.save(processo);
		
		Integer id = processo.getId();
		Optional<Processos> ids = repository.findById(id);
		Assertions.assertThat(ids).isNotEmpty();

	}
	@Test
	void testeProcessoProcuraPorNumeroProcesso(){
		Processos processo = new Processos(1, null,null, null, "processo do vitor", "processo1");
		this.repository.save(processo);
		
		Integer np = processo.getNroProcesso();
		List<Processos> nprocesso = repository.findByNroProcesso(np);
		Assertions.assertThat(nprocesso).isNotEmpty();

	}
}
