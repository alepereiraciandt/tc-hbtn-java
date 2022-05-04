package numeros;

public class Numeros0a99 {
    public static void main(String[] args) {
        for (int i = 0; i <= 99; i += 1) {
            System.out.printf(i == 99 ? " " : ", ");
        }
        System.out.printf("\n");
    }
}
