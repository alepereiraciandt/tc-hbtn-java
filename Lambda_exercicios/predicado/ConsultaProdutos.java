import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> criterio) {
        List<Produto> prt = new ArrayList<>();
        for (Produto p : produtos) {
            if (criterio.test(p)) {
                prt.add(p);
            }
        }
        return prt;
    }
}
