package ProjetoFinal.ApiGerenciadorDoc;

import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.Before;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MockMvcResultMatchersDsl;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import projetofinal.model.Usuario;
import projetofinal.repository.UsuarioRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UsuarioControllerTest {

	@Autowired
	private MockMvc mock;
	
	@Autowired(required=true)
	UsuarioRepository repository;
	
	@Before(value = "a")
	public void setUp() {
		this.mock = MockMvcBuilders.standaloneSetup(repository).build();
	}
	
	@Test
	void test() throws Exception {
		Usuario usuario = new Usuario("vitor","Vitor",1,"123");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json = mapper.writeValueAsString(usuario);

		this.mock.perform(MockMvcRequestBuilders.post("user/api/aplication")
				.contentType(MediaType.APPLICATION_JSON)
				.content(json)
				).andExpect(MockMvcResultMatchers.status().isCreated())
				 .andExpect(MockMvcResultMatchers.header().string("location", Matchers.containsString("http://localhost;/user/api/aplication")));
		
		
		
		
	}

}
