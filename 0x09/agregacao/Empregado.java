public class Empregado {
    private String nome;
    private int codigo;
    private Endereco endereco;

    public void apresentar() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Bairro: " + getEndereco().getBairro());
        System.out.println("Cidade: " + getEndereco().getCidade());
        System.out.print("Pais: " + getEndereco().getPais());
    }

    public Empregado(String nome, int codigo, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
