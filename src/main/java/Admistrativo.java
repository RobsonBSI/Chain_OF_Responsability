public class Admistrativo  extends AtendimentoCliente {

    public  Admistrativo(AtendimentoCliente superior) {
        listaProcedimento.add(GeraProcedimentoCancelamento.getProcedimentoCancelamento());
        setFuncionarioSuperior(superior);
    }
    @Override
    public String getDescricaoCargo() {
        return "Admistracao";
    }
}
