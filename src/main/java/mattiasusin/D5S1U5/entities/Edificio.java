package mattiasusin.D5S1U5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "edificio")
@NoArgsConstructor
@Getter
@Setter
public class Edificio {

    // ATTRIBUTI


    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String citta;
    private String nomeEdificio;
    private String via;

    // COSTRUTTORI

    public Edificio(String nomeEdificio, String citta, String via) {
        this.nomeEdificio = nomeEdificio;
        this.citta = citta;
        this.via = via;
    }


    // TO STRING


    @Override
    public String toString() {
        return "Edificio{" +
                "id=" + id +
                ", nomeEdificio='" + nomeEdificio + '\'' +
                ", città='" + citta + '\'' +
                ", via='" + via + '\'' +
                '}';
    }
}

