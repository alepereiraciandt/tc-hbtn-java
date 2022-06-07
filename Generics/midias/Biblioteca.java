import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {
        List<T> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarMidia(T midia) {
        this.livros.add(midia);
    }

    public List<T> obterListaMidias() {
        return livros;
    }
}
