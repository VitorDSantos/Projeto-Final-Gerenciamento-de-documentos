package projetofinal.config.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import projetofinal.model.Usuario;

@Service
public class TokenService {
	
	@Value("${projetofinal.jwt.expiration}")
	private String expiration;
	
	@Value("${projetofinal.jwt.secret}")
	private String secret;
	
	public String gerarToken(Authentication authentication) {
		Usuario logado = (Usuario) authentication.getPrincipal();
		Date data = new Date();
		Date dataFinal = new Date(data.getTime() + Long.parseLong(expiration));
		return Jwts.builder()
				.setIssuer("Usuario")
				.setSubject(logado.getId().toString())
				.setIssuedAt(data)
				.setExpiration(dataFinal)
				.signWith(SignatureAlgorithm.HS256, secret) 
				.compact();
	}
}
