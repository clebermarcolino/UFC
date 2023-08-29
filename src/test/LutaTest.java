package test;

import static org.junit.jupiter.api.Assertions.*;

import luta.Luta;
import luta.Lutador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class LutaTest {
    Lutador[] lutadores = new Lutador[4];

    @BeforeEach
    public void setUp() {
        lutadores[0] = new Lutador("Lutador 1", "Nacionalidade 1", 25, 1.75,
                70.0, 0, 0, 0);
        lutadores[1] = new Lutador("Lutador 2", "Nacionalidade 2", 28, 1.80,
                70.0, 0, 0, 0);
        lutadores[2] = new Lutador("Lutador 3","Croácia",28,1.76,
                70.3,2,3,5);
        lutadores[3] = new Lutador("Lutador 4","Egito",41,1.73,
                80.2,23,18,13);
    }

    @Test
    public void testMarcarLutaAprovada() {
        Luta luta = new Luta();
        luta.marcarLuta(lutadores[0], lutadores[2]);

        assertTrue(luta.isLutaAprovada());
        assertEquals(lutadores[0], luta.getDesafiado());
        assertEquals(lutadores[2], luta.getDesafiante());
    }

    @Test
    public void testMarcarLutaReprovada() {
        Luta luta = new Luta();
        luta.marcarLuta(lutadores[1], lutadores[3]);

        assertFalse(luta.isLutaAprovada());
        assertNull(luta.getDesafiado());
        assertNull(luta.getDesafiante());
    }

    @Test
    public void testLutarLutaAprovada() {
        Luta luta = new Luta();
        luta.marcarLuta(lutadores[0], lutadores[2]);

        // Realizar a luta
        luta.lutar();

        // Verificar se um dos lutadores ganhou ou se ocorreu um empate.
        assertTrue(lutadores[0].getNumVitorias() == 1 && lutadores[2].getNumDerrotas() == 6
                || lutadores[0].getNumDerrotas() == 1 && lutadores[2].getNumVitorias() == 3
                || lutadores[0].getNumEmpates() == 1 && lutadores[2].getNumEmpates() == 4);
    }

    @Test
    public void testLutarLutaNaoAprovada() {
        Luta luta = new Luta();
        luta.marcarLuta(lutadores[1], lutadores[3]);

        // Tentar realizar a luta
        luta.lutar();

        // Verificar mensagem de resultado
        assertFalse(luta.isLutaAprovada()); // A luta não é aprovada, mas isso não afeta a luta
    }

}
