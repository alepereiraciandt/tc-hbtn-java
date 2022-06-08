public interface Armazenavel<T> {
    public void adicionarAoInventario(String name, T item);

    public  T obterDoInventario(String name);
}
