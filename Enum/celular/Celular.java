import Contato.*;

import java.util.ArrayList;

public class Celular {
    private ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<Contato>();
    }

    public int obterPosicaoContato(String nome) {
        for (Contato c : contatos) {
            if (c.getNome() == nome) {
                 return contatos.indexOf(c);
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contato) {
        if (obterPosicaoContato(contato.getNome()) != -1)
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        else
            this.contatos.add(contato);
    }

    public void  atualizarContato(Contato contatoAntigo, Contato novoContato) {
        int idxNovoContato = obterPosicaoContato(contatoAntigo.getNome());
        int idxContatoAntigo = obterPosicaoContato(contatoAntigo.getNome());

        if (idxNovoContato != -1 && contatoAntigo.getNome() != novoContato.getNome())
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");


        if (idxContatoAntigo == -1)
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");

        this.contatos.set(idxNovoContato, novoContato);
    }

    public void removerContato(Contato contato) {
        int idxContato = obterPosicaoContato(contato.getNome());

        if (idxContato == -1)
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");

        this.contatos.remove(idxContato);
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato.getNome() + " -> " + contato.getNumeroTelefone() + " (" + contato.getCelular() + ")");
        }
    }
}
