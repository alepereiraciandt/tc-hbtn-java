import java.util.List;

public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> list, int posicao) {
        if (list.contains(posicao)) {
            return 0;
        }
        return -1;
    }

    public static void adicionarNumero(List<Integer> list, int numero) {
        if (buscarPosicaoNumero(list, numero) == -1) {
            list.add(numero);
        } else {
            System.out.println("Numero jah contido na lista");
        }
    }

    public static void removerNumero(List<Integer> list, int numero) {
        if (buscarPosicaoNumero(list, numero) != -1) {
            list.remove(Integer.valueOf(numero));
        } else {
            System.out.println("Numero nao encontrado na lista");
        }
    }

    public static void substituirNumero(List<Integer> list, int numeroSubstituir, int numeroSubstituto) {
            if (!list.contains(numeroSubstituir)) {
                list.add(numeroSubstituto);
            } else {
                list.set(list.indexOf(numeroSubstituir), numeroSubstituto);
            }
    }
}
