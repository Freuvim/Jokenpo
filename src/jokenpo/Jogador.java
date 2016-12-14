package jokenpo;

import java.util.Scanner;

public class Jogador {
   public Scanner entrada = new Scanner(System.in);
   private Elementos escolha;
   private int vitorias;
   private int derrotas;
   
   public void jogar(){
       switch(this.escolherElemento()){
           case 1:
               this.setEscolha(Elementos.PEDRA);
               break;
           case 2:
               this.setEscolha(Elementos.PAPEL);
               break;
           case 3:
               this.setEscolha(Elementos.TESOURA);
               break;
           case 4:
                System.exit(0);
                break;
       }
   }
   
   public int escolherElemento(){
        int opcao=0;
        do{
            System.out.println("1) Pedra");
            System.out.println("2) Papel");
            System.out.println("3) Tesoura");
            System.out.println("4) Parar de Jogar");
            System.out.print("Opção: ");
            if (entrada.hasNextInt()){
                opcao = entrada.nextInt();
            } else{
                entrada.next();
                opcao = 5;
            }
            if(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4)
                System.out.println("Opção inválida! Tente novamente");
        } while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4);
        return opcao;
    }
   
    /**
     * @return the escolha
     */
    public Elementos getEscolha() {
        return escolha;
    }

    /**
     * @param escolha the escolha to set
     */
    public void setEscolha(Elementos escolha) {
        this.escolha = escolha;
    }

    /**
     * @return the vitorias
     */
    public int getVitorias() {
        return vitorias;
    }

    /**
     * @param vitorias the vitorias to set
     */
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    /**
     * @return the derrotas
     */
    public int getDerrotas() {
        return derrotas;
    }

    /**
     * @param derrotas the derrotas to set
     */
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}