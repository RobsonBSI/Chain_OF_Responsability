public class GeraDocumento {

    private static GeraProcedimento tipoProcedimentoGerado;

    public void Documento(GeraProcedimento procedimento) {
        this.tipoProcedimentoGerado= procedimento;
    }

    public static GeraProcedimento getTipoProcedimentoGerado() {
        return tipoProcedimentoGerado;
    }

    public void setTipoProcedimentoGerado(GeraProcedimento tipoProcedimentoGerado) {
        this.tipoProcedimentoGerado = tipoProcedimentoGerado;
    }
}
