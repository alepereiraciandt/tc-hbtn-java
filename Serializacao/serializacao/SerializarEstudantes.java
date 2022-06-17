
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<Estudante> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        FileOutputStream fileOut = null;
        ObjectOutputStream out = null;
        try{
            fileOut = new FileOutputStream(this.nomeArquivo);
            out = new ObjectOutputStream(fileOut);
            out.writeObject(estudantes);
            out.close();
            fileOut.close();

        }catch (Exception e) {
            throw new IllegalArgumentException("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        List<Estudante> listaDeEstudantes = new ArrayList<>();
        FileInputStream fileIn = null;
        ObjectInputStream in = null;

        try{

            fileIn = new FileInputStream(this.nomeArquivo);
            in = new ObjectInputStream(fileIn);

            listaDeEstudantes = (List<Estudante>) in.readObject();

            in.close();
            fileIn.close();


        }catch (Exception e) {
            System.out.println("Nao foi possivel desserializar");
        }

        return listaDeEstudantes;
    }
}
