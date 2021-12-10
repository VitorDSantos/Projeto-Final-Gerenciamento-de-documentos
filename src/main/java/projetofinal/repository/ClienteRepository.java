package projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projetofinal.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
