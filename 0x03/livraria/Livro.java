import exceptions.*;

public class Livro {
    private String titulo;
    private String autor;
    public double preco;

    public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        if (titulo.length() >= 3) {
            setTitulo(titulo);
        } else {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }

        if (autor.contains(" ")) {
            setAutor(autor);
        } else {
            throw new AutorInvalidoException("Nome de autor invalido");
        }

        if (preco > 0) {
            setPreco(preco);
        } else {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
