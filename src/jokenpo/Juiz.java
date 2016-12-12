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
    
    
    public String verifica(Elemento e1, Elemento e2){
        if (e1.equals(e2)){
            return "Empate!!!";
        } else {
        if ((e1.getTipo() == 1) && (e2.getTipo() == 3)){
            return "Jogador 1 é o Vencedor!!!";
        }
        if ((e1.getTipo() == 2) && (e2.getTipo() == 1)){
            return "Jogador 1 é o Vencedor!!!";
        }
        if ((e1.getTipo() == 3) && (e2.getTipo() == 2)){
            return "Jogador 1 é o Vencedor!!!";
        }
            return "Jogador 2 é o Vencedor!!!";
        }
    }
    
    public void imprimeResultado(Elemento e1, Elemento e2){
        String resultado = this.verifica(e1, e2);
        System.out.println("O Resultado da partida eh: " + resultado);
    }
}
