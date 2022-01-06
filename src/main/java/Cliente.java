public class Cliente {
    public boolean realizacaoDoPedido(){
        return ClienteFacade.finalizarPedido(this);
    }
}