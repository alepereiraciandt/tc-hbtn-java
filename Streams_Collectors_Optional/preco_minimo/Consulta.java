import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {

        return produtos
                .stream()
                .filter(produto -> produto.getPreco() >= precoMinimo)
                .collect(Collectors.toList());
    }
}
