public class Financeiro  extends AtendimentoCliente {

    public Financeiro(AtendimentoCliente superior) {
        listaProcedimento.add(GeraProcedimentoBoleto.getProcedimentoBoleto());
        setFuncionarioSuperior(superior);
    }
    @Override
    public String getDescricaoCargo() {
        return "Financeiro";
    }
}
