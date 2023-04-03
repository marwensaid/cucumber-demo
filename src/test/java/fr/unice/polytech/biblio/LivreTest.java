package fr.unice.polytech.biblio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class LivreTest { // Just pour vérifier que JUnit 5 est bien configuré

    private Livre livre;

    @BeforeEach
    public void setUp() {
        Bibliotheque biblio = new Bibliotheque();
        this.livre = new Livre(biblio);
    }

    @Test
    public void EtudiantCreated() {

        assertFalse(this.livre.getEmprunte());
    }

}
