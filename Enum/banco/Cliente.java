import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome, Double transacoes) {
        this.nome = nome;
        this.transacoes = new ArrayList<Double>();
        this.transacoes.add(transacoes);
    }

    public void adicionarTransacao(Double valor) {
        this.transacoes.add(valor);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }
}
