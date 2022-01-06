import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveRetornarPagamentoDoPedido(){
        Cliente cliente = new Cliente();
        Pagamento.getInstancia().addPedido(cliente);
        assertEquals(false, cliente.realizacaoDoPedido());
    }
    @Test
    void deveRetornarPedidoEmPreparo(){
        Cliente cliente = new Cliente();
        EmPreparo.getInstancia().addPedido(cliente);
        assertEquals(false, cliente.realizacaoDoPedido());
    }
    @Test
    void deveRetornarPedidoSaiuParaEntrega(){
        Cliente cliente = new Cliente();
        SaiuParaEntrega.getInstancia().addPedido(cliente);
        assertEquals(false, cliente.realizacaoDoPedido());
    }
    @Test
    void deveRetornarPedidoEntregue(){
        Cliente cliente = new Cliente();
        Entregue.getInstancia().addPedido(cliente);
        assertEquals(false, cliente.realizacaoDoPedido());
    }
    @Test
    void verifaPedidoFinalizado(){
        Cliente cliente = new Cliente();
        assertEquals(true, cliente.realizacaoDoPedido());
    }

}