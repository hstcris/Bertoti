import org.example.Jogo;
import org.junit.Test;
import static org.junit.Assert.*;

public class JogoTest {

    @Test
    public void testAlugar() {
        Jogo jogo = new Jogo("The Last of Us Part II", "PlayStation 4");
        assertTrue(jogo.estaDisponivel());
        jogo.alugar();
        assertFalse(jogo.estaDisponivel());
    }

    @Test
    public void testDevolver() {
        Jogo jogo = new Jogo("The Last of Us Part II", "PlayStation 4");
        jogo.alugar();
        assertFalse(jogo.estaDisponivel());
        jogo.devolver();
        assertTrue(jogo.estaDisponivel());
    }
}
