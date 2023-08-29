package luta;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private  boolean lutaAprovada;

    public Luta() {
        rounds = 2;
        lutaAprovada = false;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
       if(rounds <= 0 || rounds > 2) {
           throw new IllegalArgumentException("Número de rounds inválido");
       }
       else {
           this.rounds = rounds;
       }
    }

    public boolean isLutaAprovada() {
        return lutaAprovada;
    }

    public void setLutaAprovada(boolean lutaAprovada) {
        this.lutaAprovada = lutaAprovada;
    }

    private void Equals() {

    }

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
            if(desafiado.getCategoria().equals(desafiante.getCategoria()) && !desafiado.equals(desafiante)) {
                setLutaAprovada(true);
                this.desafiado = desafiado;
                this.desafiante = desafiante;
            }
            else {
                setLutaAprovada(false);
                this.desafiado = null;
                this.desafiante = null;
            }
        }

    public void lutar() {
        if(lutaAprovada) {
            desafiado.apresentar();
            desafiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(3);

            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Resultado da Luta: Empate! ");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;

                case 1: // desafiado ganhou
                    System.out.println("Resultado da luta: " + desafiado.getNome() + " ganhou");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;

                case 2: // desafiante ganhou
                    System.out.println("Resultado da luta: " + desafiante.getNome() + " ganhou");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }
        }
        else {
            System.out.println("A luta não pode acontecer! ");
        }
    }
}
