package provedores;

public class JadLog implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        int gramas = 2000;
        Frete f = new Frete();
        double total = 0;

        if (peso < gramas) {
            total = valor * 0.045;

        } else {
            total = valor * 0.07;

        }

        f.setValor(total);
        f.setTipoProvedorFrete(obterTipoProvedorFrete());
        return f;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
