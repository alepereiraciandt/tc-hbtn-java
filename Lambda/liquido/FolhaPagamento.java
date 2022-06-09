public class FolhaPagamento {

    public static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario salario) {
        return salario.calcular(funcionario.getSalario());
    }
}
