package pojo.Casas;

import pojo.Copo;
import pojo.Jogador;

public class Companhia extends Propriedade{
    int taxa;

    public Companhia(String nome, int valor, int taxa) {
        super(nome, valor, taxa);
        this.taxa = taxa;
    }

    @Override
    public void acao(Jogador jogador) {
       
    }
    
    public int calcularTaxa(Jogador jogador) {
    	return jogador.getValorDados() * this.taxa;
    }

}
