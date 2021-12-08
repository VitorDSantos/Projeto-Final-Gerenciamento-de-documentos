package ProjetoFinal.ApiGerenciadorDoc;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import projetofinal.model.Usuario;
import projetofinal.repository.UsuarioRepository;
import projetofinal.service.UsuarioService;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UsuarioTest {

	@Autowired(required=true)
	UsuarioRepository repository;
	
//	@Autowired
//	UsuarioService service;

	
	@Test
	void testAdicaoDeUsuario() throws Exception {
		Usuario usuario = new Usuario("vitor","Vitor",1,"123");
		this.repository.save(usuario);
		
		Assertions.assertThat(usuario.getId()).isNotNull();
		Assertions.assertThat(usuario.getNome()).isEqualTo("Vitor");
		Assertions.assertThat(usuario.getLogin()).isEqualTo("vitor");
		Assertions.assertThat(usuario.getSenha()).isEqualTo("123");
		Assertions.assertThat(usuario.getNumeroOAB()).isEqualTo(1);
		
	}
	@Test
	void testeDeleteUser() {
		Usuario users = new Usuario("vitor","Vitor",1,"123");
		this.repository.save(users);
		Long id = users.getId();
		repository.deleteById(id);
		Assertions.assertThat(repository.findById(users.getId())).isEmpty();
		
		
	}
	@Test
	void testeUpdateUser() {
		Usuario users = new Usuario("vitor","Vitor",1,"123");
		this.repository.save(users);
		
		users.setLogin("vinicius");
		users.setSenha("1234");
		users.setNome("Vinicius");
		users.setNumeroOAB(2);
		this.repository.save(users);
		
		Assertions.assertThat(users.getNome()).isEqualTo("Vinicius");
		Assertions.assertThat(users.getLogin()).isEqualTo("vinicius");
		Assertions.assertThat(users.getSenha()).isEqualTo("1234");
		Assertions.assertThat(users.getNumeroOAB()).isEqualTo(2);
		
		
	}
	@Test
	void testeUsuarioProcuraPorNome()   {
		Usuario users = new Usuario("vitor","Vitor",1,"123");
		Usuario users2 = new Usuario("vini","Vini",2,"123");
		this.repository.save(users);
		this.repository.save(users2);
		List<Usuario> name = repository.findByNome("Vitor");
		
		Assertions.assertThat(name).hasSize(1);

	}
	
	@Test
	void testeUsuarioProcuraPorLogin() throws Exception {
		Usuario users = new Usuario("vitor","Vitor",1,"123");
		Usuario users2 = new Usuario("vini","Vini",2,"123");
		this.repository.save(users);
		this.repository.save(users2);
		
		String login = users.getLogin();
		Optional<Usuario> logado = repository.findByLogin(login);
		Assertions.assertThat(logado).isNotEmpty();

	}
}
