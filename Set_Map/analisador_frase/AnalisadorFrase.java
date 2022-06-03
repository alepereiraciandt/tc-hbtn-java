
import java.util.*;

public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        TreeMap<String, Integer> f = new TreeMap<>();

        frase = frase.replace("?","");
        frase = frase.replace("!","");
        frase = frase.replace(".","");

        ArrayList<String> keys = new ArrayList<>();

        for (String s : List.of(frase.split(" "))) {
            keys.add(s.toLowerCase());
        }

        for (String key : keys) {
            String value = key.toLowerCase();
            f.put(value, Collections.frequency(keys, value));
        }

        return f;
    }
}
