package ProjetoFinal.ApiGerenciadorDoc.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

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
@Entity
public class Cliente {

	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nome;
	private String email;
	private Integer telefone;
	private int nro_processo;
	@OneToOne
	private Documento documentacao;
}
