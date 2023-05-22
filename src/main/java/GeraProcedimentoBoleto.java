public class GeraProcedimentoBoleto implements GeraProcedimento{

    private static GeraProcedimentoBoleto procedimentoBoleto = new GeraProcedimentoBoleto();

    private GeraProcedimentoBoleto() {};

    public static GeraProcedimentoBoleto getProcedimentoBoleto() {
        return procedimentoBoleto;
    }
}
