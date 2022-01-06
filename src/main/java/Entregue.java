public class Entregue extends Status {
    private static Entregue entregue = new Entregue();

    private Entregue(){};

    public static Entregue getInstancia(){
        return entregue;
    }
}
