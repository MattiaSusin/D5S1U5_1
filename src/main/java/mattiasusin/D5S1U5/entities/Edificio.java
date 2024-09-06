package mattiasusin.D5S1U5.entities;

import jakarta.persistence.Entity;
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
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String nomeEdificio;
    private String città;
    private String via;


    // COSTRUTTORI

    public Edificio(String nomeEdificio, String città, String via) {
        this.nomeEdificio = nomeEdificio;
        this.città = città;
        this.via = via;
    }


    // TO STRING


    @Override
    public String toString() {
        return "Edificio{" +
                "id=" + id +
                ", nomeEdificio='" + nomeEdificio + '\'' +
                ", città='" + città + '\'' +
                ", via='" + via + '\'' +
                '}';
    }
}

