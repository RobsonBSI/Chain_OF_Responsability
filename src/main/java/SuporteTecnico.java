public class SuporteTecnico  extends AtendimentoCliente {

    public SuporteTecnico(AtendimentoCliente superior) {
        listaProcedimento.add(GeraProcedimentoChamado.getProcedimentoChamado());
        setFuncionarioSuperior(superior);
    }
    @Override
    public String getDescricaoCargo() {
        return "Suporte Tecnico";
    }
}
