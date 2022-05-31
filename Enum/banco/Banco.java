import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String nomeAgencia) {
        Agencia a = null;
        for(Agencia agencia : this.agencias) {
            if (agencia.getNome().equals(nomeAgencia)) {
                a = agencia;
            }
        }
        return a;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia == null) {
            this.agencias.add(new Agencia(nomeAgencia));
            return true;
        }  else {
            return false;
        }
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valor) {
        Agencia agencia = buscarAgencia(nomeAgencia);

        if(agencia.buscarCliente(nomeCliente) == null) {
            agencia.novoCliente(nomeCliente, valor);
            return true;
        };

        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valor) {
        Agencia agencia = buscarAgencia(nomeAgencia);

        if (agencia.buscarCliente(nomeCliente) != null) {
            agencia.adicionarTransacaoCliente(nomeCliente, valor);
            return true;
        }

        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacoes) {
        Agencia agencia = buscarAgencia(nomeAgencia);

        if (agencia != null) {
            int count = 0;
            for (Cliente c : agencia.getClientes()) {
                count++;
                if (!imprimeTransacoes) {
                    System.out.printf("Cliente: %s [%d]\n", c.getNome(), count);
                } else {
                    int count2 = 0;
                    System.out.printf("Cliente: %s [%d]\n", c.getNome(), count);
                    for (double transacoes : c.getTransacoes()) {
                        count2++;
                        System.out.printf("[%d] valor %.2f\n", count2, transacoes);
                    }
                }
            }

            return true;
        }

        return false;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }
}
