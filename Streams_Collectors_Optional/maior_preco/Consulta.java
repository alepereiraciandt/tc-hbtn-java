import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Consulta {

    static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos
                .stream()
                .max(Comparator.comparing(Produto::getPreco))
                .orElseThrow(NoSuchElementException::new);
    }
}
