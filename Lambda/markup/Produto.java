import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 10;
    public Consumer<Double> atualizarMarkup = t -> percentualMarkup = t;
    public Supplier<Double> precoComMarkup = () -> preco + (preco * percentualMarkup / 100);

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
