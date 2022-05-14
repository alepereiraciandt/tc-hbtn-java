package retangulo_completo;
public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    public void setLargura(double largura) {
        if (largura < 0) {
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        } else {
            this.largura = largura;
        }
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        } else {
            this.altura = altura;
        }
    }

    @Override
    public String toString() {
        String formatedString = String.format("[Retangulo] %1$.2f / %2$.2f", largura, altura);
        return formatedString;
    }

    @Override
    public double area() {
        double areaDeUmTriangulo = (altura * largura);
        return areaDeUmTriangulo;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }
}
