package provedores;

public class Sedex implements  ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        int gramas = 1000;
        Frete f = new Frete();
        double total = 0;

        if (peso < gramas) {
            total = valor * 0.05;

        } else {
            total = valor * 0.10;
        }

        f.setValor(total);
        f.setTipoProvedorFrete(obterTipoProvedorFrete());
        return f;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
