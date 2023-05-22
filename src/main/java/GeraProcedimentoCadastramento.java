public class GeraProcedimentoCadastramento  implements GeraProcedimento {
    private static GeraProcedimentoCadastramento procedimentoCadastramento = new GeraProcedimentoCadastramento();

    private GeraProcedimentoCadastramento() {};

    public static GeraProcedimentoCadastramento getProcedimentoCadastramento() {
        return procedimentoCadastramento;
    }
}
