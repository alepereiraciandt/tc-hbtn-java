import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> hashMap;

    public ListaTelefonica() {
        this.hashMap = new HashMap<String, HashSet<Telefone>>();
    }

    public HashSet<Telefone>  adicionarTelefone(String nome, Telefone telefone) {
        HashSet<Telefone> tel = new HashSet<>();

        tel.add(telefone);

        if (buscar(nome) != null) {

            if (this.hashMap.containsKey(nome) && this.hashMap.get(nome).contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            }

            for (String n : this.hashMap.keySet()) {
                if (this.hashMap.get(n).contains(telefone)) {
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }

            hashMap.get(nome).add(telefone);
        } else {
            this.hashMap.put(nome, tel);
        }

        return this.hashMap.get(nome);
    }

    public HashSet<Telefone> buscar(String nome) {

        if (hashMap.containsKey(nome)) {
            return hashMap.get(nome);
        }

        return null;
    }
}
