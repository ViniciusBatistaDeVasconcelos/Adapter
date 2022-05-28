import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DinheiroTest {

    @Test
    void deveRetornarDinheiroEmReal() {
        Dinheiro dinheiro = new Dinheiro();
        dinheiro.setMoedaReal(2.5f);

        assertEquals(2.5f, dinheiro.getMoedaReal(), 0.1f);
    }

    @Test
    void deveRetornarDinheiroEmDolarAmericano() {
        Dinheiro dinheiro = new Dinheiro();
        dinheiro.setMoedaReal(2.5f);

        assertEquals(0.53f, dinheiro.getMoedaDolarAmericano(), 0.1f);
    }

    @Test
    void deveRetornarStringDeConversao() {
        Dinheiro dinheiro = new Dinheiro();
        dinheiro.setMoedaReal(2.5f);

        assertEquals("R$ 2,5 = US$ 0,53", dinheiro.toString());
    }
}