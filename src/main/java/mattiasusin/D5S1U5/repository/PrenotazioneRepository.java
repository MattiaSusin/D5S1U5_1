package mattiasusin.D5S1U5.repository;

import mattiasusin.D5S1U5.entities.Postazione;
import mattiasusin.D5S1U5.entities.Prenotazione;
import mattiasusin.D5S1U5.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {


    // QUERY
    List<Prenotazione> findByUtenteAndData(Utente utente, LocalDate data);

    List<Prenotazione> findByPostazioneAndData(Postazione postazione, LocalDate data);

}
