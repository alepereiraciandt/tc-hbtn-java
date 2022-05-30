
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public List<PedidoCookie> getCookies() {
        return cookies;
    }

    public void setCookies(List<PedidoCookie> cookies) {
        this.cookies = cookies;
    }

    public void adicionarPedidoCookie(PedidoCookie cookie) {
        cookies.add(cookie);
    }

    public int removerSabor(String sabor) {
        int total = 0;
            for (int i = 0; i < cookies.size(); i++) {
                if (this.cookies.get(i).getSabor().equals(sabor)) {
                    total += this.cookies.get(i).getQuantidadeCaixas();
                    this.cookies.remove(i);
                }
        }
        return total;
    }

    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie cookie : cookies) {
            total += cookie.getQuantidadeCaixas();
        }
        return total;
    }
}
