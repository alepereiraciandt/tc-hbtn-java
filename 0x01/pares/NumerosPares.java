public class NumerosPares {
    public static void main(String[] args) {
        for (int i = 0; i <= 99; i += 1) {
            if (i % 2 == 0) {
                System.out.printf(i == 99 ? i + "" : i + ", ");
            }
        }
    }
}
