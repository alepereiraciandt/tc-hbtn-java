package status;

public class PersonagemGame {
    private String nome;
    private int saudeAtual;

    private String status;

    public void tomarDano(int quantidadeDeDano) {
        this.saudeAtual -= quantidadeDeDano;
        if (saudeAtual < 0) {
            saudeAtual = 0;
            setStatus("morto");
        }
    }

    public void receberCura(int quantidadeDeCura) {
        setStatus("vivo");
        saudeAtual += quantidadeDeCura;
        if (saudeAtual > 100) {
            saudeAtual = 100;
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getNome() {
        return nome;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual != 0) {
            setStatus("vivo");
        } else {
            setStatus("morto");
        }
    }
}

