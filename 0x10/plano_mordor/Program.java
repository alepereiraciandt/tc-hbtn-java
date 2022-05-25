package plano_mordor;

import comida.*;
import humor.*;
import comida.Cogumelo;
import comida.Comida;
import comida.Maca;
import comida.OutraComida;
import comida.Cram;
import comida.Melao;
import comida.Lembas;
import comida.BoloDeMel;
import Personagem;

public class Program {
    public static void main(String[] args) {
        Personagem gandalf = new Personagem();
        Personagem bilbo = new Personagem();
        Personagem legolas = new Personagem();
        Personagem tauriel = new Personagem();

        gandalf.comer(new Comida[] {
                new Maca(),
                new Maca(),
                new Cogumelo(),
                new OutraComida()
        });

        System.out.println(gandalf.toString());

        bilbo.comer(new Comida[] {
                new BoloDeMel(),
                new Maca(),
                new Melao(),
                new Cogumelo()
        });

        System.out.println(bilbo.toString());

        legolas.comer(new Comida[] {
                new BoloDeMel(),
                new Maca(),
                new Melao(),
                new Cogumelo(),
                new BoloDeMel(),
                new Cram(),
                new Cram()
        });

        System.out.println(legolas.toString());

        legolas.comer(new Comida[] {
                new BoloDeMel(),
                new Maca(),
                new Melao(),
                new Cogumelo(),
                new BoloDeMel(),
                new Lembas(),
                new Lembas(),
                new Cram()
        });

        System.out.println(legolas.toString());
    }
}
