package workflow;

import workflow.atividades.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
    private List<Atividade> atividadeList = new ArrayList<Atividade>();
    public void registrarAtividade(Atividade atividade) {
        atividadeList.add(atividade);
    }

    public List<Atividade> getAtividadeList() {
        return atividadeList;
    }
}
