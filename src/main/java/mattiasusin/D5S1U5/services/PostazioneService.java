package mattiasusin.D5S1U5.services;

import lombok.extern.slf4j.Slf4j;
import mattiasusin.D5S1U5.entities.Postazione;
import mattiasusin.D5S1U5.exceptions.ValidationException;
import mattiasusin.D5S1U5.repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PostazioneService {
    @Autowired
    private PostazioneRepository postazioneRepository;

    //QUERY
    // 1. Salva
    public void savePostazione(Postazione newPostazione) {
        // 1. Controllo se esiste una postazione con questo id
        if (postazioneRepository.existsById(newPostazione.getId()))
            throw new ValidationException("L'id " + newPostazione.getId() + " è già in utilizzo");
        // 2. Altri metodi di validazione
        if (newPostazione.getDescrizione().length() < 8)
            throw new ValidationException("Descrizione troppo corta");
        // 3. Salvo Postazione
        postazioneRepository.save(newPostazione);
        // 4. Log di avvenuto salvataggio
        log.info("Nuova postazione " + newPostazione.getId() + " salvata");
    }

    // 2. FindByTipoPostazioneAndCittàInteresse
  /*  public List<Postazione> findByTipoDiPostazioneAndCittàInteresse(TipoPostazione tipoPostazione, String città) {
        return PostazioneRepository.findByTipoDiPostazioneAndCittàInteresse(tipoPostazione, città);
    }*/

}
