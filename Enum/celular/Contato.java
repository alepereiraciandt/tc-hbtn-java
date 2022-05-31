public class Contato {
    private String nome;
    private String numeroTelefone;
    private TipoNumero celular;

    public Contato(String nome, String numeroTelefone, TipoNumero celular) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.celular = celular;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public void setCelular(TipoNumero celular) {
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public TipoNumero getCelular() {
        return celular;
    }
}
