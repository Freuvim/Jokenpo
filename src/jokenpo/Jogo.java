package jokenpo;

import java.util.Scanner;

public class Jogo {
    
    private int rodada=1, vez=1;
    private Jogador jogador1;
    private Jogador jogador2;
    private Juiz juiz;
    public Scanner entrada = new Scanner(System.in);
    
    public Jogo(){
        iniciar();
        while( Jogar() );
    }
    
    public void iniciar(){
        jogador1 = new Jogador();
        jogador2 = new Jogador();
        juiz = new Juiz();
    }
    
    public boolean Jogar(){
            System.out.println("----------------------");
            System.out.println("\nRodada "+rodada);
            System.out.println("É a vez do jogador " + vez() );            
            if(vez()==1){
                jogador1.jogar();
            } else {
                jogador2.jogar();
                juiz.verifica(this.jogador1.getEscolha(), this.jogador2.getEscolha());
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
}
