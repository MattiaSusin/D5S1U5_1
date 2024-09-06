package mattiasusin.D5S1U5.repository;

import mattiasusin.D5S1U5.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UtenteRepository extends JpaRepository<Utente, String> {

    boolean existsByUsername(String username);

    List<Utente> findByUsername(String username);

}
