package produtos;
public class Livro extends Produto {
    private int paginas;
    private String autor;
    private int edicao;

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        super(titulo, ano, pais, precoBruto);
        setPaginas(paginas);
        setAutor(autor);
        setEdicao(edicao);
    }

    @Override
    public double obterPrecoLiquido() {
        double twentyPercent = (this.precoBruto * 15) / 100;
        return this.precoBruto + twentyPercent;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
