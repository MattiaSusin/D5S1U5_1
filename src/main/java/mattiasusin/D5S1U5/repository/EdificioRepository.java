package mattiasusin.D5S1U5.repository;

import mattiasusin.D5S1U5.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EdificioRepository extends JpaRepository<Edificio, UUID> {
}
