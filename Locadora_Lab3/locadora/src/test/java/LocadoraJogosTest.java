import org.example.Jogo;
import org.example.LocadoraJogos;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LocadoraJogosTest {

    public LocadoraJogos locadora;

    @Before
    public void setUp() {
        locadora = new LocadoraJogos();
    }

    @Test
    public void testAdicionarJogo() {
        Jogo jogo = new Jogo("The Last of Us Part II", "PlayStation 4");
        locadora.adicionarJogo(jogo);
        assertEquals(1, locadora.getJogos().size());
        assertEquals("The Last of Us Part II", locadora.getJogos().get(0).getNome());
        assertEquals("PlayStation 4", locadora.getJogos().get(0).getPlataforma());
    }
}
