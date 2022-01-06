public class SaiuParaEntrega extends Status{
    private static SaiuParaEntrega entrega = new SaiuParaEntrega();

    private SaiuParaEntrega(){};

    public static SaiuParaEntrega getInstancia() {
        return entrega;
    }
}
