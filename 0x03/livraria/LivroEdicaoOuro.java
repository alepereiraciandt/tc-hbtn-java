import exceptions.*;

public class LivroEdicaoOuro extends Livro {
    public LivroEdicaoOuro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        super(titulo, autor, preco);
    }

    @Override
    public int getPreco() {
        return super.preco * 1.3;
    }
}
