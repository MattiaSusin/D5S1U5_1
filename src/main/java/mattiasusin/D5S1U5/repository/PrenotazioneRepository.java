package mattiasusin.D5S1U5.repository;

import mattiasusin.D5S1U5.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {


    // QUERY

}
