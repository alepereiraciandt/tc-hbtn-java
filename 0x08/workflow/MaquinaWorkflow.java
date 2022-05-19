package workflow;

import workflow.atividades.Atividade;

public class MaquinaWorkflow {
    public void executar(Workflow workflow) {
        for(Atividade w : workflow.getAtividadeList()) {
            w.executar();
        }
    }
}
