public class Pagamento extends Status{
    private static Pagamento pagamento = new Pagamento();

    private Pagamento(){};

    public static Pagamento getInstancia(){
        return pagamento;
    }
}
