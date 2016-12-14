package jokenpo;

/**
 *
 * @author Fréuvim
 */
public class Juiz {
    
    public String verifica(Jogador j1, Jogador j2){
        if (j1.getEscolha().equals(j2.getEscolha())){
            return "Empate!!!";
        } else {
            if ((j1.getEscolha().equals(Elementos.PEDRA)) && (j2.getEscolha().equals(Elementos.TESOURA))){
                j1.setVitorias(j1.getVitorias()+1);
                j2.setDerrotas(j2.getDerrotas()+1);
                return "Jogador 1 é o Vencedor!!!";
            }
            if ((j1.getEscolha().equals(Elementos.PAPEL)) && (j2.getEscolha().equals(Elementos.PEDRA))){
                j1.setVitorias(j1.getVitorias()+1);
                j2.setDerrotas(j2.getDerrotas()+1);
                return "Jogador 1 é o Vencedor!!!";
            }
            if ((j1.getEscolha().equals(Elementos.TESOURA)) && (j2.getEscolha().equals(Elementos.PAPEL))){
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
        System.out.println("O Resultado da partida é: " + resultado);
    }
}
