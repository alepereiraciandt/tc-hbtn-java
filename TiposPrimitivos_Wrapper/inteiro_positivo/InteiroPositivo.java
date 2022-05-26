public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(Integer valor) {
        setValor(valor.intValue());
    }

    public InteiroPositivo(String valor) {
        setValor(Integer.parseInt(valor));
    }

    public boolean ehPrimo() {
        boolean isItPrime = true;
        if (this.valor <= 1) {
            isItPrime = false;
            return isItPrime;
        } else {
            for (int i = 2; i <= this.valor / 2; i++) {
                if ((this.valor % 2) == 0) {
                    isItPrime = false;

                    break;
                }
            }
            return isItPrime;
        }
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        int v = valor.intValue();
        if (v < 0) {
            System.out.println("Valor nao eh um valor inteiro positivo");
        } else {
            this.valor = v;
        }
    }
}
