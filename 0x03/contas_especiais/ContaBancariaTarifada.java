import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes;

    public ContaBancariaTarifada(double saldo, String numeracao, double taxaJurosAnual, int quantidadeTransacoes) {
        super(saldo, numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = quantidadeTransacoes;
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor - 0.10);
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor - 0.10);
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}
