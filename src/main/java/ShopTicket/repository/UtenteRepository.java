package ShopTicket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ShopTicket.model.Utente;

@Repository("utenteRepository")
public interface UtenteRepository extends JpaRepository<Utente, Long> {
    Utente findByEmail(String email);

    @Query("SELECT p FROM Utente p WHERE p.id=?1 ")
    Utente findbyId_utente(Long id);
}
