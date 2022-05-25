

import plano_mordor.comida.Comida;
import plano_mordor.humor.*;

public class Personagem {
    private int pontosDeFelicidade;

    public Humor obterHumorAtual() {
        Humor humor = null;
        if (pontosDeFelicidade < -5) {
            humor = new Irritado();
        } else if (pontosDeFelicidade >= - 5 && pontosDeFelicidade <= 0) {
            humor = new Triste();
        } else if (pontosDeFelicidade >= 1 && pontosDeFelicidade <= 15) {
            humor = new Feliz();
        } else {
            humor = new MuitoFeliz();
        }
        return humor;
    }

    public void comer(Comida[] comidas) {
        for(Comida comida : comidas) {
            this.pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return pontosDeFelicidade + " - " + obterHumorAtual().getClass().getSimpleName();
    }
}
