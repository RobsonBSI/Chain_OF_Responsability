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

    public String registrarProcedimento(Procedimento procedimento) {
        if (listaProcedimento.contains(Procedimento.getTipoProcedimentoGerado())){
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.registrarProcedimento(procedimento);
            }
            else
            {
                return "Sem Procedimento";
            }
        }
    }


}
