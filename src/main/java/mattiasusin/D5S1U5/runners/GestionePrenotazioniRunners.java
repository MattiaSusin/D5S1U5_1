package mattiasusin.D5S1U5.runners;

import mattiasusin.D5S1U5.entities.Edificio;
import mattiasusin.D5S1U5.entities.Postazione;
import mattiasusin.D5S1U5.entities.Prenotazione;
import mattiasusin.D5S1U5.entities.Utente;
import mattiasusin.D5S1U5.enums.TipoPostazione;
import mattiasusin.D5S1U5.services.EdificioService;
import mattiasusin.D5S1U5.services.PostazioneService;
import mattiasusin.D5S1U5.services.PrenotazioneService;
import mattiasusin.D5S1U5.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class GestionePrenotazioniRunners implements CommandLineRunner {
    @Autowired
    private UtenteService utenteService;

    @Autowired
    private EdificioService edificioService;

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private PrenotazioneService prenotazioneService;


    @Override
    public void run(String... args) throws Exception {


        Edificio edificio1 = new Edificio("Dal Negro", "Treviso", "Via Roma, 5");
        Edificio edificio2 = new Edificio("Venezia", "Milano", "via Trieste, 46");
        Edificio edificio3 = new Edificio("Samba", "Otranto", "Via Milano, 1");

        edificioService.saveEdificio(edificio1);
        edificioService.saveEdificio(edificio2);
        edificioService.saveEdificio(edificio3);


        Utente utente1 = new Utente("petersmith12@gmail.com", "Peter Smith", 6, "psmith");
        Utente utente2 = new Utente("johnjoe@yhaoo.com", "Johm Doe", 12, "jDoe");
        Utente utente3 = new Utente("rosaferrucci00@libero.com", "Rosa Ferrucci", 1, "rosaf");


        utenteService.saveUtente(utente1);
        utenteService.saveUtente(utente2);
        utenteService.saveUtente(utente3);


        Postazione postazione1 = new Postazione("Sala Riunioni", TipoPostazione.RIUNIONI, 10, edificio1);
        Postazione postazione2 = new Postazione("Open Space", TipoPostazione.OPEN_SPACE, 15, edificio1);
        Postazione postazione3 = new Postazione("Sala Riunioni Grande", TipoPostazione.RIUNIONI, 50, edificio2);
        Postazione postazione4 = new Postazione("Sala Riunioni", TipoPostazione.PRIVATO, 2, edificio3);
        Postazione postazione5 = new Postazione("Open Space", TipoPostazione.OPEN_SPACE, 35, edificio3);

        postazioneService.savePostazione(postazione1);
        postazioneService.savePostazione(postazione2);
        postazioneService.savePostazione(postazione3);
        postazioneService.savePostazione(postazione4);
        postazioneService.savePostazione(postazione5);

        Prenotazione prenotazione1 = new Prenotazione(utente1, postazione1, LocalDate.of(2024, 8, 28));
        Prenotazione prenotazione2 = new Prenotazione(utente2, postazione3, LocalDate.of(2024, 8, 31));
        Prenotazione prenotazione3 = new Prenotazione(utente3, postazione5, LocalDate.of(2024, 9, 5));
        Prenotazione prenotazione4 = new Prenotazione(utente1, postazione4, LocalDate.of(2024, 9, 7));

        prenotazioneService.savePrenotazione(prenotazione1);
        prenotazioneService.savePrenotazione(prenotazione2);
        prenotazioneService.savePrenotazione(prenotazione3);
        prenotazioneService.savePrenotazione(prenotazione4);


        System.out.println("Dati inseriti con successo nel database:");
    }
}
//METODI
// 1. Salva utente
// 2. Salva postazioni(Edifici)
// 3. Salva