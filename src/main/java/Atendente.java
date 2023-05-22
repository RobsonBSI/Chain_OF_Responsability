public class Atendente extends AtendimentoCliente {


    public Atendente(AtendimentoCliente superior) {
        listaProcedimento.add(GeraProcedimentoCadastramento.getProcedimentoCadastramento());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente";
    }
}
