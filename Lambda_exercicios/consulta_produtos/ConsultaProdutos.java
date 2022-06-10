import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterio) {
        List<Produto> prt = new ArrayList<>();
        for (Produto p : produtos) {
            if (criterio.testar(p)) {
                prt.add(p);
            }
        }
       return prt;
    }
}
