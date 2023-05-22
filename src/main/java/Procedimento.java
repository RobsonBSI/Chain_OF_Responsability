public class Procedimento {
    private static GeraProcedimento tipoProcedimentoGerado;

    public void Procedimento(GeraProcedimento procedimento) {
        this.tipoProcedimentoGerado= procedimento;
    }

    public static GeraProcedimento getTipoProcedimentoGerado() {
        return tipoProcedimentoGerado;
    }

    public void setTipoProcedimentoGerado(GeraProcedimento tipoProcedimentoGerado) {
        this.tipoProcedimentoGerado = tipoProcedimentoGerado;
    }
}
