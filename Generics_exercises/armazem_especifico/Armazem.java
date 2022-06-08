import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<T> implements Armazenavel<T> {
    private Map<String, T> map;


    public Armazem() {
        this.map = new HashMap<>();
    }

    @Override
    public void adicionarAoInventario(String name, T item) {
        if (!map.containsKey(name)) {
            map.put(name, item);
        }
    }

    @Override
    public T obterDoInventario(String name) {
        if (map.containsKey(name)) {
            return map.get(name);
        }
        return null;
    }
}
