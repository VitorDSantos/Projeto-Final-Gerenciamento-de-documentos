package ProjetoFinal.ApiGerenciadorDoc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AutenticacaoControllerTest {

	@Autowired
	private MockMvc mock;
	
	@Test
	public void deveDevolver400CasoAutenticacaoEstejaErrada() throws Exception {
		URI uri = new URI("/auth");
		String json = "{\"login\":\"vitor\",\"senha\":\"123456\"}";
		
		mock
		.perform(MockMvcRequestBuilders
				.post(uri)
				.content(json)
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers
				.status()
				.is(400));
		
		
		
		
	}

}
