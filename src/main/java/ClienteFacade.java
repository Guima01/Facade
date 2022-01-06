public class ClienteFacade {
    public static boolean finalizarPedido(Cliente cliente){
        if(Pagamento.getInstancia().verificaPedido(cliente)){
            return false;
        }
        if(EmPreparo.getInstancia().verificaPedido(cliente)){
            return false;
        }
        if(SaiuParaEntrega.getInstancia().verificaPedido(cliente)){
            return false;
        }
        if(Entregue.getInstancia().verificaPedido(cliente)){
            return false;
        }
        return true;
    }
}