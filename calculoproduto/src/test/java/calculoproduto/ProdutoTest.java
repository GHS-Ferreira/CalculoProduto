import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void testValorProdutoValido() {
        assertEquals(55.0, Produto.calcularNovoValor(50.0));
    }

    @Test
    void testValorProdutoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> Produto.calcularNovoValor(-10.0));
    }

    @Test
    void testValorProdutoZero() {
        assertThrows(IllegalArgumentException.class, () -> Produto.calcularNovoValor(0.0));
    }
}
