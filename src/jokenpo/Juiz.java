/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo;

/**
 *
 * @author Fréuvim
 */
public class Juiz {
    
    
    public String verifica(Jogador j1, Jogador j2){
        Elemento e1 = j1.getEscolha();
        Elemento e2 = j2.getEscolha();
        if (e1.equals(e2)){
            return "Empate!!!";
        } else {
            if ((e1.getTipo() == 1) && (e2.getTipo() == 3)){
                j1.setVitorias(j1.getVitorias()+1);
                j2.setDerrotas(j2.getDerrotas()+1);
                return "Jogador 1 é o Vencedor!!!";
            }
            if ((e1.getTipo() == 2) && (e2.getTipo() == 1)){
                j1.setVitorias(j1.getVitorias()+1);
                j2.setDerrotas(j2.getDerrotas()+1);
                return "Jogador 1 é o Vencedor!!!";
            }
            if ((e1.getTipo() == 3) && (e2.getTipo() == 2)){
                j1.setVitorias(j1.getVitorias()+1);
                j2.setDerrotas(j2.getDerrotas()+1);
                return "Jogador 1 é o Vencedor!!!";
            }
            j2.setVitorias(j1.getVitorias()+1);
            j1.setDerrotas(j2.getDerrotas()+1);
            return "Jogador 2 é o Vencedor!!!";
        }
    }
    
    public void imprimeResultado(Jogador j1, Jogador j2){
        String resultado = this.verifica(j1, j2);
        System.out.println("O Resultado da partida eh: " + resultado);
    }
}
