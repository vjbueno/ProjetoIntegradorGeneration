package com.AskMarinho.app.RedeSocial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AskMarinho.app.RedeSocial.models.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

	public List<Comentario> findAllByTextoContainingIgnoreCase(String texto);
}
