package mattiasusin.D5S1U5.repository;

import mattiasusin.D5S1U5.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, UUID> {
    boolean existsByNomeEdificio(String nomeEdificio);
}
