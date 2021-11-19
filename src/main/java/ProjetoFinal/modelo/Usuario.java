package ProjetoFinal.modelo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
	private Long id;
	private String nome;
	private Integer NumeroOAB;
	private String login;
	private String senha;


	
	
}
