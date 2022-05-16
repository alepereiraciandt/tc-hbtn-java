package resumo_pedido;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        setPercentualDesconto(percentualDesconto);
        setItens(itens);
    }

    public void apresentarResumoPedido() {
        int i,j;
        System.out.println("------- RESUMO PEDIDO -------");
        for (i = 0; i < itens.length; i += 1) {
            String type = itens[i].getProduto().getClass().getSimpleName();
            String title = itens[i].getProduto().getTitulo();
            double price = itens[i].getProduto().obterPrecoLiquido();
            int quantity = itens[i].getQuantidade();
            double total = price * quantity;
            System.out.printf("Tipo: %s Titulo: %s Preco: %.2f Quant: %d Total: %.2f\n", type, title, price, quantity, total);
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", percentualDesconto);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", itens[0].getProduto().obterPrecoLiquido());
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
