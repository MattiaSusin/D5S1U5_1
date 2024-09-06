package mattiasusin.D5S1U5.repository;

import mattiasusin.D5S1U5.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PostazioneRepository extends JpaRepository<Postazione, UUID> {

    // QUERY


}
