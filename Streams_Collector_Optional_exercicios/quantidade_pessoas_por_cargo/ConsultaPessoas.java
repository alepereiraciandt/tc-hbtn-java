import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ConsultaPessoas {
    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {
        return pessoas
                .stream()
                .collect(groupingBy(Pessoa::getCargo, Collectors.counting()));
    }
}
