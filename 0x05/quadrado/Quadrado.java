public class Quadrado extends Retangulo {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        } else {
            this.lado = lado;
            this.setAltura(lado);
            this.setLargura(lado);
        }
    }

    @Override
    public String toString() {
        return String.format("[Quadrado] %1$.2f ", lado);
    }
}
