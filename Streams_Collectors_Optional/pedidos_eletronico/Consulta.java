import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream()
                .filter(pedido -> pedido.getProdutos()
                        .stream()
                        .anyMatch(p -> p.getCategoria().equals(CategoriaProduto.ELETRONICO)))
                .collect(Collectors.toList());
    }
}
