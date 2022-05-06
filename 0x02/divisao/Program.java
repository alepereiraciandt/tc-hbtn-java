package divisao;

public class Program {
    public static void main(String[] args) {
        double res1 = 0;
        try {
            Numero operador = new Numero();
            int a, b;

            a = 9;
            b = 4;
            res1 = operador.dividir(a, b);

            a = 10;
            b = 0;
            res1 = operador.dividir(a, b);

        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println(String.valueOf(res1));
        }
    }
}
