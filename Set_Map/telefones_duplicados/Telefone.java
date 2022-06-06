public class Telefone {
    private String codigoArea;
    private String numero;


    @Override
    public String toString() {
        return String.format("(%s) %s", codigoArea, numero);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Telefone telefone = (Telefone) o;

        if (!codigoArea.equals(telefone.codigoArea)) return false;
        return numero.equals(telefone.numero);
    }

    @Override
    public int hashCode() {
        int result = codigoArea.hashCode();
        result = 5 * result + numero.hashCode();
        return result;
    }

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public String getNumero() {
        return numero;
    }
}
