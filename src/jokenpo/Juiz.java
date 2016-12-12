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
        Boolean retorna = false;
        if (e1.equals(e2)){
            System.out.println("Empate!");
            retorna = true;
        } else {
            if (((e1.getTipo() == 1) && (e2.getTipo() == 3)) 
                    || ((e1.getTipo() == 2) && (e2.getTipo() == 1))
                    || ((e1.getTipo() == 3) && (e2.getTipo() == 2))){
                    System.out.println("Jogador 1 é o Vencedor!!!");
            } else {
                System.out.println("O Jogador 2 é o Vencedor!!!"); 
               
            }
            retorna = true;
        }
        return retorna;
    }
}
