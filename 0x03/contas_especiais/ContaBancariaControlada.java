import exceptions.*;

public class ContaBancariaControlada extends ContaBancariaBasica {
    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaDeJuros, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaDeJuros);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        super.aplicarAtualizacaoMensal();
        if (this.getSaldo() < this.saldoMinimo || this.getSaldo() == 0) {
            this.setSaldo(this.getSaldo() - this.valorPenalidade);
        }
    }
}
