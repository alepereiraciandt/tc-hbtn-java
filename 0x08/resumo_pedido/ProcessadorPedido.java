import resumo_pedido.provedores.ProvedorFrete;

public class ProcessadorPedido {
    private ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido) {
//        pedido.getFrete().setTipoProvedorFrete();
//        pedido.getFrete().setValor(provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal()));
        pedido.setFrete(provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal()));
    }
}
