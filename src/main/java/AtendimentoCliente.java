import java.util.ArrayList;

public abstract class AtendimentoCliente {
    protected ArrayList listaProcedimento = new ArrayList();
    private AtendimentoCliente  funcionarioSuperior;

    public AtendimentoCliente  getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(AtendimentoCliente  funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String geraProcedimento(AtendimentoCliente procedimento) {
        if (listaProcedimento.contains(GeraDocumento.getTipoProcedimentoGerado())){
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.geraProcedimento(procedimento);
            }
            else
            {
                return "Sem Procedimento";
            }
        }
    }
}
