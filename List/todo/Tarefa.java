public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) {
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public void modificarDescricao(String novaDesc) {
        if (novaDesc == null || novaDesc.isEmpty()) {
            throw new NullPointerException("Descricao de tarefa invalida");
        } else {
            setDescricao(novaDesc);
        }
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }
}
