package main;

import luta.Luta;
import luta.Lutador;

public class Main {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[6];

        lutadores[0] = new Lutador("José Aldo","Brasil",35,1.74,
                81.3,22,20,2);

        lutadores[1] = new Lutador("Charles Oliveira","Brasil",27,1.81,
                75,32,14,6);

        lutadores[2] = new Lutador("Everton Ribeiro","Brasil",32,1.68,
                78,19,9,3);

        lutadores[3] = new Lutador("Steven Maguire","Estados Unidos",30,1.74,
                85,21,6,15);

        lutadores[4] = new Lutador("Rock Balboa","Itália",37,1.77,
                90,25,7,5);

        lutadores[5] = new Lutador("Alexander Arnold","Inglaterra",25,1.76,
                75,26,16,10);


        Luta ufc = new Luta();

        ufc.marcarLuta(lutadores[0],lutadores[1]);
        ufc.lutar();
        ufc.marcarLuta(lutadores[2],lutadores[3]);
        ufc.lutar();

        lutadores[0].status();
        lutadores[1].status();
        lutadores[2].status();
        lutadores[3].status();

        // Mais lutas podem ser realizadas, depende da escolha do usuário.
    }
}