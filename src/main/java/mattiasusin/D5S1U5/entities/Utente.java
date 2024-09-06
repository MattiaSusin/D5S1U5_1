package mattiasusin.D5S1U5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String username;
    private String nomeECognome;
    private String email;
    private int numeroPrenotazioni;

    //COSTRUTTORI

    public Utente(String username, String nomeECognome, String email, int numeroPrenotazioni) {
        this.username = username;
        this.nomeECognome = nomeECognome;
        this.email = email;
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
