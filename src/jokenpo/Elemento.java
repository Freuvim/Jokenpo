/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo;

public class Elemento {
    private int tipo;

    @Override
    public boolean equals(Object e) {
        return (e instanceof Elemento) && ((Elemento) e).getTipo() == this.getTipo();
    }

    @Override
    public int hashCode() {
       return this.getTipo();
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
   
}
