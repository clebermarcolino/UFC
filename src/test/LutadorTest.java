package test;

import static org.junit.jupiter.api.Assertions.*;

import luta.Lutador;
import org.junit.jupiter.api.Test;

public class LutadorTest {
    @Test
    public void testCriarLutador() {
        Lutador lutador = new Lutador("Lutador Teste", "Brasil", 25, 1.75, 70.0, 0, 0, 0);

        assertEquals("Lutador Teste", lutador.getNome());
        assertEquals("Brasil", lutador.getNacionalidade());
        assertEquals(25, lutador.getIdade());
        assertEquals(1.75, lutador.getAltura());
        assertEquals(70.0, lutador.getPeso());
        assertEquals("Leve", lutador.getCategoria());
        assertEquals(0, lutador.getNumVitorias());
        assertEquals(0, lutador.getNumEmpates());
        assertEquals(0, lutador.getNumDerrotas());
    }

    @Test
    public void testSetPesoCategoriaInvalida() {
        Lutador lutador = new Lutador("Lutador Teste", "Nacionalidade", 25, 1.75, 150.0, 0, 0, 0);

        assertEquals("Inválido!", lutador.getCategoria());
    }

    @Test
    public void testGanharLuta() {
        Lutador lutador = new Lutador("Lutador Teste", "Nacionalidade", 25, 1.75, 70.0, 0, 0, 0);
        lutador.ganharLuta();

        assertEquals(1, lutador.getNumVitorias());
    }

    @Test
    public void testPerderLuta() {
        Lutador lutador = new Lutador("Lutador Teste", "Nacionalidade", 25, 1.75, 70.0, 0, 0, 0);
        lutador.perderLuta();

        assertEquals(1, lutador.getNumDerrotas());
    }

    @Test
    public void testEmpatarLuta() {
        Lutador lutador = new Lutador("Lutador Teste", "Nacionalidade", 25, 1.75, 70.0, 0, 0, 0);
        lutador.empatarLuta();

        assertEquals(1, lutador.getNumEmpates());
    }
}
