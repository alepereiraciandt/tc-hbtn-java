package divisao;

public class Numero {
    public static double dividir(double dividendo, double divisor)  throws  Exception {
        if (divisor == 0) {
            throw new Exception("Nao eh possivel dividir por zero");
        }
        return (dividendo / divisor);
    }
}
