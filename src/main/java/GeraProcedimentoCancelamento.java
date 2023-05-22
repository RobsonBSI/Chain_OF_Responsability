public class GeraProcedimentoCancelamento implements GeraProcedimento {

    private static GeraProcedimentoCancelamento procedimentoCancelamento = new GeraProcedimentoCancelamento();

    private GeraProcedimentoCancelamento() {};

    public static GeraProcedimentoCancelamento getProcedimentoCancelamento() {
        return procedimentoCancelamento;
    }
}
