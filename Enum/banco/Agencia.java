import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.clientes = new ArrayList<Cliente>();
        this.nome = nome;
    }

    public boolean novoCliente(String nome, double valorInicialTransacao) {
        Cliente cliente = buscarCliente(nome);

        if (cliente == null) {
            this.clientes.add(new Cliente(nome, valorInicialTransacao));
            return true;
        }
            return false;
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacao) {
        Cliente cliente = buscarCliente(nomeCliente);

        if (cliente != null) {
            cliente.adicionarTransacao(valorTransacao);
            return true;
        }

        return false;
    }
    public Cliente buscarCliente(String nomeCliente) {
        for (Cliente c : this.clientes) {
            if (c.getNome().equals(nomeCliente)) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
