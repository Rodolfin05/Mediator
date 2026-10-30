package padraomediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitanteTest {

    @Test
    void deveVisitarProtocolo() {
        Visitante visitante = new Visitante();
        assertEquals("Seja bem-vindo à Prefeitura.\n"+
                ">>Rodolfo, favor comparecer ao Protocolo",
                visitante.visitarProtocolo("Rodolfo"));
    }

    @Test
    void deveVisitarRH() {
        Visitante visitante = new Visitante();
        assertEquals("Seja bem-vindo à Prefeitura.\n"+
                        ">>Rodolfo, favor comparecer ao RH",
                visitante.visitarRH("Rodolfo"));
    }
}
