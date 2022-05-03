import java.util.Locale;
import java.text.NumberFormat;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.322f;

        NumberFormat currency = NumberFormat.getInstance(new Locale("en", "US"));

        currency.setMaximumFractionDigits(3);

        System.out.println("Valor: R$ " + currency.format(valor));

        System.out.printf("Taxa: %.2f%%", taxa);
    }
}