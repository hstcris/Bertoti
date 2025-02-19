import org.example.CadastrarCliente;
import org.junit.Test;
import static org.junit.Assert.*;

public class CadastrarClienteTest {

    @Test
    public void testGetNome() {
        CadastrarCliente cliente = new CadastrarCliente("Maria", 25);
        assertEquals("Maria", cliente.getNome());
    }

    @Test
    public void testGetIdade() {
        CadastrarCliente cliente = new CadastrarCliente("Maria", 25);
        assertEquals(25, cliente.getIdade());
    }
}
