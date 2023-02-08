package br.com.cambio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cambio.api.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {

	Cambio findByFromAndTo(String from, String to);
	
}