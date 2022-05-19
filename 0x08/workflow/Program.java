import workflow.atividades.CarregarVideo;
import workflow.atividades.EnviarEmail;
import workflow.atividades.CodificarVideo;
import workflow.atividades.ModificarStatusVideo;

public class Program {
    public static void main(String[] args) {
        MaquinaWorkflow maquinaWorkflow = new MaquinaWorkflow();

        Workflow workflowEncodificarVideos = new Workflow();

        workflowEncodificarVideos.registrarAtividade(new CarregarVideo());
        workflowEncodificarVideos.registrarAtividade(new CodificarVideo());
        workflowEncodificarVideos.registrarAtividade(new EnviarEmail());

        maquinaWorkflow.executar(workflowEncodificarVideos);

        System.out.println("-----");

        Workflow workflowVideos = new Workflow();

        workflowVideos.registrarAtividade(new CarregarVideo());
        workflowVideos.registrarAtividade(new EnviarEmail());

        maquinaWorkflow.executar(workflowVideos);

        System.out.println("-----");

        Workflow workflowVideosStatus = new Workflow();

        workflowVideosStatus.registrarAtividade(new CarregarVideo());
        workflowVideosStatus.registrarAtividade(new ModificarStatusVideo());
        workflowVideosStatus.registrarAtividade(new EnviarEmail());

        maquinaWorkflow.executar(workflowVideosStatus);
    }
}
