
import java.util.*;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] arrayInteiros) {
        List<Integer> countCur = new ArrayList<>();

        for (int i : arrayInteiros) {
            countCur.add(i);
        }

        HashSet<Integer> hashInt = new HashSet<>();

        for (int j : countCur) {
            int cur = Collections.frequency(countCur, j);
            if (cur > 1) {
                hashInt.add(j);
            }
        }

        TreeSet<Integer> inteirosTree = new TreeSet<>(hashInt);

        return inteirosTree;
    }
}
