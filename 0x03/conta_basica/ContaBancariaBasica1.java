import exceptions.*;


public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    private final int CEM_PORCENTO = 100;

    public ContaBancariaBasica1(double saldo, String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        } else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        } else if (valor > this.saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        } else {
            this.saldo -= valor;
        }
    }

    public double calcularTarifaMensal() {
        double valor1 = 10;
        double valor2 = (this.saldo * 10) / CEM_PORCENTO;
        double tarifa;
        if (valor1 < valor2) {
            tarifa =  valor1;
        } else {
            tarifa = valor2;
        }
        return tarifa;
    }

    public double calcularJurosMensal() {
        double juros = 0;
        int mounth = 12;
        if (this.saldo > 0) {
            juros = this.saldo * ((this.taxaJurosAnual / mounth) / CEM_PORCENTO);
        }
        return juros;
    }

    public void aplicarAtualizacaoMensal() {
        double aplicandoTarifa = calcularTarifaMensal();
        double aplicandoJuros = calcularJurosMensal();

        this.saldo -= aplicandoTarifa;
        this.saldo += aplicandoJuros;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }


    protected void setSaldo(double v) {
    }
}
