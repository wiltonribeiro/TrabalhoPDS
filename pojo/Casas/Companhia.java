package pojo.Casas;

import pojo.Copo;
import pojo.Jogador;

public class Companhia extends Propriedade{
    private int taxa;

    public Companhia(String nome, int valor, int taxa, int x, int y) {
        super(nome, valor, taxa, x, y);
        this.taxa = taxa;        
    }

    @Override
    public void acao(Jogador jogador) {
       
    }
    
    public int calcularTaxa(Jogador jogador) {
    	return jogador.getValorDados() * this.taxa;
    } 

}
