public class GeraProcedimentoChamado implements GeraProcedimento {
    private static GeraProcedimentoChamado procedimentoChamado = new GeraProcedimentoChamado();

    private GeraProcedimentoChamado() {};

    public static GeraProcedimentoChamado getProcedimentoChamado() {
        return procedimentoChamado;
    }
}
