package projetofinal.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


@Entity
public class Usuario implements UserDetails{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private int numeroOAB;
	private String login;
	private String senha;

	@ManyToMany(fetch = FetchType.EAGER)
	private List<Perfil> perfis = new ArrayList<>();
	//@ManyToOne
	//private Cliente cliente;
	//@OneToMany
	//private Processos processos;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public Usuario(
			@NotNull @NotEmpty 
			String nome, 
			@NotNull @NotEmpty 
			String login, 
			@NotNull @NotEmpty 
			String senha,
			@NotNull
			int numeroOAB) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.numeroOAB = numeroOAB;
	}
	
	public Usuario() {
		
	}
	public Usuario(@NotNull @NotEmpty String nome2, @NotNull @NotEmpty String login2, @NotNull @NotEmpty String senha2,
			@NotNull @NotEmpty int nroProcesso, @NotNull int numeroOAB2) {
	
	}


	public Usuario(String login, String nome, int numeroOAB, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.numeroOAB = numeroOAB;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumeroOAB() {
		return numeroOAB;
	}


	public void setNumeroOAB(int numeroOAB) {
		this.numeroOAB = numeroOAB;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.perfis;
	}

	@Override
	public String getPassword() {
		return this.senha ;
	}

	@Override
	public String getUsername() {
		return this.login;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}



	}
	