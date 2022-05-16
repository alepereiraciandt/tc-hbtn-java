public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        setPercentualDesconto(percentualDesconto);
        setItens(itens);
    }

    public String apresentarResumoPedido() {
        return String.format("Tipo: ", itens.getClass());
    }

    public String test() {
        return "testing";
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.itens.length; i += 1) {
            total += itens[i].getQuantidade() * itens[i].getProduto().obterPrecoLiquido();
        }
        return total - (total * (this.percentualDesconto/100));
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }
}
