package jokenpo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jogo {
    
    private int rodada=1, vez=1;
    private Jogador jogador1;
    private Jogador jogador2;
    private Juiz juiz;
    public Scanner entrada = new Scanner(System.in);
    
    public Jogo(){
        iniciar();
        while(Jogar());
    }
    
    public void iniciar(){
        jogador1 = new Jogador();
        jogador1.setVitorias(0);
        jogador1.setDerrotas(0);
        jogador2 = new Jogador();
        jogador2.setVitorias(0);
        jogador2.setDerrotas(0);
        juiz = new Juiz();
    }
    
    public boolean Jogar(){
            this.tabela();
            if(vez()==1){
                jogador1.jogar();
            } else {
                jogador2.jogar();
                juiz.imprimeResultado(this.jogador1, this.jogador2);
                rodada++;
            }
            vez++;
            return true;
    }
    
    public int vez(){
        if(vez%2 == 1)
            return 1;
        else
            return 2;
    }
    
    private void tabela(){
        String formatJogadores = "| %-10s | %-8d | %-8d | %n";
            String formatRodada = "| %-10s | %-19d | %n";
            String formatVez = "| %-10s | %-19s | %n";
            System.out.format("+------------+----------+----------+%n");
            System.out.format("| Jogadores  | Vitorias | Derrotas |%n");
            System.out.format("+------------+----------+----------+%n");
            System.out.format(formatJogadores, "Player 1",
                    this.jogador1.getVitorias(),
                    this.jogador1.getDerrotas());  
            System.out.format(formatJogadores, "Player 2",
                    this.jogador2.getVitorias(),
                    this.jogador2.getDerrotas()); 
            System.out.format("+------------+----------+----------+%n");
            System.out.format(formatRodada, "Rodada", rodada);
            System.out.format("+------------+----------+----------+%n");
            System.out.format(formatVez, "Vez: ", "jogador " + vez);
            System.out.format("+------------+----------+----------+%n"); 
    }
}
