package mattiasusin.D5S1U5.services;

import lombok.extern.slf4j.Slf4j;
import mattiasusin.D5S1U5.entities.Prenotazione;
import mattiasusin.D5S1U5.repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    // QUERY
    // 1. Salva
    public void savePrenotazione(Prenotazione newPrenotazione) {
        // 1. Salva la prenotazione
        prenotazioneRepository.save(newPrenotazione);

        // 4. Log di avvenuto salvataggio
        log.info("nuova Prenotazione " + newPrenotazione.getId() + "  salvata");
    }
    // 2. FindByUsernameAndData
}



