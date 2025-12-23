package dev.marcelopinotti.CadastroDePersonagem.Personagens;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonagemRepository extends JpaRepository<PersonagemModel, Long> {
}
