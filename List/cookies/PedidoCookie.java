package cookies;

public class PedidoCookie {
    private String sabor;
    private int quantidadeCaixas;

    public PedidoCookie(String sabor, int quantidadeCaixas) {
        this.sabor = sabor;
        this.quantidadeCaixas = quantidadeCaixas;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setQuantidadeCaixas(int quantidadeCaixas) {
        this.quantidadeCaixas = quantidadeCaixas;
    }

    public String getSabor() {
        return sabor;
    }

    public int getQuantidadeCaixas() {
        return quantidadeCaixas;
    }
}
