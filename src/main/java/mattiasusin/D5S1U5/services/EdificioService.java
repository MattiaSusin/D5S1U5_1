package mattiasusin.D5S1U5.services;

import lombok.extern.slf4j.Slf4j;
import mattiasusin.D5S1U5.entities.Edificio;
import mattiasusin.D5S1U5.exceptions.ValidationException;
import mattiasusin.D5S1U5.repository.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EdificioService {
    @Autowired
    private EdificioRepository edificioRepository;

    public void saveEdificio(Edificio newEdificio) {
        // 1. Controlla se esiste un' edificio con questo Nome
        if (edificioRepository.existsByNomeEdificio(newEdificio.getNomeEdificio()))
            throw new ValidationException("L'Edificio " + newEdificio.getNomeEdificio() + " esiste già");

        //3. Salva l'edificio
        edificioRepository.save(newEdificio);

        // 4. Log di avvenuto salvataggio
        log.info("nuovo Edificio " + newEdificio.getNomeEdificio() + "  salvato");
    }
}
