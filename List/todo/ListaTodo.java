import java.util.ArrayList;

public class ListaTodo {
    private List<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        for (Tarefa value : tarefas) {
            if (value.getIdentificador() == tarefa.getIdentificador()) {
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
            }
            tarefa.modificarDescricao(tarefa.getDescricao());
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getIdentificador() == identificador) {
                tarefas.get(i).setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getIdentificador() == identificador) {
                tarefas.get(i).setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for(int i = 0; i < tarefas.size(); i++) {
            tarefas.get(i).setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for(int i = 0; i < tarefas.size(); i++) {
            tarefas.get(i).setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        String mark = "";
        for(Tarefa t : tarefas) {
            if (t.isEstahFeita()) {
                mark = "[X]";
            } else {
                mark = "[ ]";
            }
            System.out.println(mark + " Id: " + t.getIdentificador() + " - Descricao: " + t.getDescricao());
        }
    }
}
