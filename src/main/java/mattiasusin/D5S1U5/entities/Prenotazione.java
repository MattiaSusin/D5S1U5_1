package mattiasusin.D5S1U5.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Prenotazione")
@NoArgsConstructor
@Getter
@Setter
public class Prenotazione {

    // ATTRIBUTI

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    private LocalDate data;
    private boolean stato;

    @ManyToOne
    @JoinColumn(name = "utente_username")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;


    // COSTRUTTORE

    public Prenotazione(Utente utente, Postazione postazione, LocalDate data) {
        this.utente = utente;
        this.postazione = postazione;
        this.data = data;
        this.stato = true;
    }


    // TO STRING
    @Override
    public String toString() {
        return "Prenotazione{" +
                "data=" + data +
                ", id=" + id +
                ", stato=" + stato +
                ", utente=" + utente +
                '}';
    }
}

