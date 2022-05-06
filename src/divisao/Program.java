package divisao;

public class Program {
    public static void main(String[] args) {
        try {
            Program operador = new Program();
            int a, b;

            a = 4;
            b = 3;
            res1 = operador.dividir(a, b);

            a = 9;
            b = 0;
            res2 = operador.dividir(a, b);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.printf(res1);
            System.out.printf(res2);
        }
    }

    public static double dividir(double dividendo, double divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("Nao eh possivel dividir por zero");
        }
        return (dividendo / divisor);
    }
}
