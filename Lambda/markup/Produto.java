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

    public void setPreco(double preco) {
        this.preco = preco;
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
