import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PortalTest {

    Portal portal;
    Reclamacao reclamacao;

    @BeforeEach
    void setUp() {
        portal = new Portal();
        reclamacao = new Reclamacao (0001, "Oi", "Alguem");
    }

    @Test
    void deveAbrirReclamacao() {
        Tarefa aberturaReclamacao = new AberturaReclamacaoTarefa(reclamacao);
        portal.executarTarefa(aberturaReclamacao);

        assertEquals("Reclamacao aberta", reclamacao.getSituacao());
    }

    @Test
    void deveFecharReclamacao() {
        Tarefa fechamentoReclamacao = new FechamentoReclamacaoTarefa(reclamacao);
        portal.executarTarefa(fechamentoReclamacao);

        assertEquals("Reclamacao fechada", reclamacao.getSituacao());
    }

    @Test
    void deveCancelarFechamentoReclamacao() {
        Tarefa aberturaReclamacao = new AberturaReclamacaoTarefa(reclamacao);
        Tarefa fechamentoReclamacao = new FechamentoReclamacaoTarefa(reclamacao);

        portal.executarTarefa(aberturaReclamacao);
        portal.executarTarefa(fechamentoReclamacao);

        portal.cancelarUltimaReclamacao();

        assertEquals("Reclamacao aberta", reclamacao.getSituacao());
    }
    
}
