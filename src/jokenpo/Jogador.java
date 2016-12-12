/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo;

import java.util.Scanner;

public class Jogador {
   private int vez;
   public Scanner entrada = new Scanner(System.in);
   private Elemento escolha = new Elemento();
   private int vitorias;
   private int derrotas;
   
   public void jogar(){
      this.getEscolha().setTipo(this.escolherElemento());
   }
   
   public int escolherElemento(){
        int opcao=0;
        do{
            System.out.println("1) Pedra");
            System.out.println("2) Papel");
            System.out.println("3) Tesoura");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            if(opcao != 1 && opcao != 2 && opcao != 3)
                System.out.println("Opção inválida! Tente novamente");
        } while(opcao != 1 && opcao != 2 && opcao != 3);
        return opcao;
    }

    /**
     * @return the vez
     */
    public int getVez() {
        return vez;
    }

    /**
     * @param vez the vez to set
     */
    public void setVez(int vez) {
        this.vez = vez;
    }

    /**
     * @return the escolha
     */
    public Elemento getEscolha() {
        return escolha;
    }

    /**
     * @param escolha the escolha to set
     */
    public void setEscolha(Elemento escolha) {
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