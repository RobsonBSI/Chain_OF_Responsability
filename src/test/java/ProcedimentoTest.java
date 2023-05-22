import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcedimentoTest {
    Financeiro financeiro;
    Admistrativo admistrador;
    SuporteTecnico tecnico;
    Atendente atendente;

    @BeforeEach
    void setUp() {
        admistrador = new Admistrativo(null);
        financeiro = new Financeiro(admistrador);
        tecnico = new SuporteTecnico(financeiro);
        atendente = new Atendente(tecnico);
    }
    @Test
    void deveRetornarAtendenteParaCadastroNovoCliente() {
        assertEquals("Atendente",atendente.registrarProcedimento(new Procedimento(GeraProcedimentoCadastramento.getProcedimentoCadastramento())));
    }
}
