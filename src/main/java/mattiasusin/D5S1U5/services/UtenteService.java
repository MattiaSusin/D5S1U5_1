package mattiasusin.D5S1U5.services;

import lombok.extern.slf4j.Slf4j;
import mattiasusin.D5S1U5.entities.Utente;
import mattiasusin.D5S1U5.exceptions.ValidationException;
import mattiasusin.D5S1U5.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    public void saveUtente(Utente newUtente) {
        // 1. Controllo se esiste già un utente con questo username

        if (utenteRepository.existsByUsername(newUtente.getUsername()))
            throw new ValidationException("L'utente " + newUtente.getUsername() + " è già in utilizzo!");

        // 2. Altri nomi di validazione User
        if (newUtente.getNomeECognome().length() < 2) throw new ValidationException("Nome troppo corto!");

        // 3. Salvo l'utente
        utenteRepository.save(newUtente);

        // 4. Log di avvenuto salvataggio
        log.info("Nuovo Utente " + newUtente.getUsername() + " salvato");

    }


}
