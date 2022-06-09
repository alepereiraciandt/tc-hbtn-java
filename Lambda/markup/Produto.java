import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 0.10;
    public Supplier<Double> precoComMarkup;
    public Consumer<Double> atualizarMarkup;

    public Produto(double preco, String nome) {
        this.nome = nome;
        setPreco(preco);
    }

    public void setPreco(double preco) {
        this.preco = preco;
        setPrecoComMarkup(() -> preco + (preco * getPercentualMarkup()));
        setAtualizarMarkup(t -> setPrecoComMarkup(() -> preco + (preco * (getPercentualMarkup() * (getPercentualMarkup() * t)))));
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }

    public void setPrecoComMarkup(Supplier<Double> precoComMarkup) {
        this.precoComMarkup = precoComMarkup;
    }

    public void setAtualizarMarkup(Consumer<Double> atualizarMarkup) {
        this.atualizarMarkup = atualizarMarkup;
    }

    public String getNome() {
        return nome;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    public Supplier<Double> getPrecoComMarkup() {
        return precoComMarkup;
    }

    public Consumer<Double> getAtualizarMarkup() {
        return atualizarMarkup;
    }

    public double getPreco() {
        return preco;
    }
}
