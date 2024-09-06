package mattiasusin.D5S1U5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Utente")
public class Utente {

    // ATTRIBUTI

    @Id
    @Setter(AccessLevel.NONE)
    private String email;
    private String nomeECognome;
    private int numeroPrenotazioni;
    private String username;

    //COSTRUTTORI

    public Utente(String email, String nomeECognome, int numeroPrenotazioni, String username) {
        this.email = email;
        this.username = username;
        this.nomeECognome = nomeECognome;
        this.numeroPrenotazioni = numeroPrenotazioni;
    }


    // TO STRING

    @Override
    public String toString() {
        return "Utente{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", nomeECognome='" + nomeECognome + '\'' +
                ", numeroPrenotazioni=" + numeroPrenotazioni +
                '}';
    }

}
