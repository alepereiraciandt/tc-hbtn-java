package workflow;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
     List<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();

     public void registrarCanal(CanalNotificacao canal) {
        canais.add(canal);
     }


    public void processar(Video video) {
         for (CanalNotificacao canal : this.canais) {
             canal.notificar(new Mensagem(video.getArquivo() + " - " + video.getFormato(), TipoMensagem.LOG));
         }
     }
}
