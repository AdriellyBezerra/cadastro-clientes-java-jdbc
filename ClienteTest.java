package br.adryy0.cadastro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveCriarClienteValido() {
        Cliente cliente = new Cliente(1, "Ana", "ana@email.com");
        assertEquals("Ana", cliente.nome());
    }

    @Test
    void deveRejeitarEmailInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cliente(1, "Ana", "email-invalido"));
    }
}
