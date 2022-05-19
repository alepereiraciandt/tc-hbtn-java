package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        int gramas = 5000;
        Frete f = new Frete();
        double total = 0;

        if (peso < gramas) {
            total = valor * 0.04;

        } else {
            total = valor * 0.12;
        }

        f.setValor(total);
        f.setTipoProvedorFrete(obterTipoProvedorFrete());
        return f;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
