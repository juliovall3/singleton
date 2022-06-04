package singletonTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PresidenteTest {
    @Test
    public void deveRetornarNomePresidente(){
        Presidente.getInstance().setNomePresidente("Bolsonaro");
        assertEquals("Bolsonaro", Presidente.getInstance().getNomePresidente());
    }

    @Test
    public void deveRetornarCpfPresidente() {
        Presidente.getInstance().setCpfPresidente("1212121212-21");
        assertEquals("1212121212-21", Presidente.getInstance().getCpfPresidente());
    }

    @Test
    public void deveRetornarEnderecoPresidente() {
        Presidente.getInstance().setEnderecoPresidente("Rua Joao Carlos Garcia, 193");
        assertEquals("Rua Joao Carlos Garcia, 193", Presidente.getInstance().getEnderecoPresidente());
    }
}
