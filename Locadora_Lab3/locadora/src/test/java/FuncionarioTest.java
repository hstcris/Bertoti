import org.example.Funcionario;
import org.junit.Test;
import static org.junit.Assert.*;

public class FuncionarioTest {

    @Test
    public void testGetNome() {
        Funcionario funcionario = new Funcionario("João", "Atendente");
        assertEquals("João", funcionario.getNome());
    }

    @Test
    public void testGetCargo() {
        Funcionario funcionario = new Funcionario("João", "Atendente");
        assertEquals("Atendente", funcionario.getCargo());
    }
}
