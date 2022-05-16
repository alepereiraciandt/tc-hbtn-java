public class Dvd extends Produto {
    private String diretor;
    private String genero;
    private int duracao;

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
        super(titulo, ano, pais, precoBruto);
        setDiretor(diretor);
        setGenero(genero);
        setDuracao(duracao);
    }

    public String getDiretor() {
        return diretor;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public double obterPrecoLiquido() {
        double fifteenPercent = (this.precoBruto * 20) / 100;
        return this.precoBruto + fifteenPercent;
    }
}
