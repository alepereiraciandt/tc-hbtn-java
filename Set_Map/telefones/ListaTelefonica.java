
import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> hashMap;

    public ListaTelefonica() {
        this.hashMap = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        ArrayList<Telefone> tel = new ArrayList<>();

        tel.add(telefone);

        if (buscar(nome) != null) {
            hashMap.get(nome).add(telefone);
        } else {
            this.hashMap.put(nome, tel);
        }
    }

    public ArrayList<Telefone> buscar(String nome) {

        if (hashMap.containsKey(nome)) {
            return hashMap.get(nome);
        }

        return null;
    }
}
