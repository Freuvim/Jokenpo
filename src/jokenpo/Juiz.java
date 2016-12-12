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
    
    
    public Boolean verifica(Elemento e1, Elemento e2){
        if (e1.equals(e2)){
            System.out.println("Empate!");
            return true;
        }
        if ((e1.getTipo() == 1) && (e2.getTipo() == 3)){
            System.out.println("Jogador 1 é o Vencedor!!!");
            return true;
        }
        if ((e1.getTipo() == 2) && (e2.getTipo() == 1)){
            System.out.println("Jogador 1 é o Vencedor!!!");
            return true;
        }
        if ((e1.getTipo() == 3) && (e2.getTipo() == 2)){
            System.out.println("Jogador 1 é o Vencedor!!!");
            return true;
        }
        System.out.println("Jogador 2 é o Vencedor!!!");
        return false;
    }
}
