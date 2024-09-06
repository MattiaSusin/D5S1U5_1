package mattiasusin.D5S1U5.services;

import lombok.extern.slf4j.Slf4j;
import mattiasusin.D5S1U5.entities.Prenotazione;
import mattiasusin.D5S1U5.exceptions.ValidationException;
import mattiasusin.D5S1U5.repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Slf4j
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    // QUERY
    // 1. Salva
    public void savePrenotazione(Prenotazione newPrenotazione) {
        // 1. Controlla se esiste la prenotazione tramite id
        if (prenotazioneRepository.existsById(newPrenotazione.getId()))
            throw new ValidationException("La Prenotazione " + newPrenotazione.getId() + " esiste già");
        // 2. Altri metodi di validazione
        if (newPrenotazione.getData().isBefore(LocalDate.now()))
            throw new ValidationException("Data non valida");
        // 3. Salva la prenotazione
        prenotazioneRepository.save(newPrenotazione);

        // 4. Log di avvenuto salvataggio
        log.info("nuova Prenotazione " + newPrenotazione.getId() + "  salvata");
    }
    // 2. FindByUsernameAndData
}



