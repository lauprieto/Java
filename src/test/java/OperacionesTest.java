import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OperacionesTest {
    @Test
    public void testSumar() {
        Operaciones op = new Operaciones();
        assertEquals(5, op.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        Operaciones op = new Operaciones();
        assertEquals(1, op.restar(5, 4));
    }

    @Test
    public void testMultiplicar() {
        Operaciones op = new Operaciones();
        assertEquals(6, op.multiplicar(2, 3));
    }
}
