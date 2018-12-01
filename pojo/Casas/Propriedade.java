package pojo.Casas;

import interfaces.Casa;
import pojo.Jogador;

public abstract class Propriedade implements Casa{
    String nome;
    int preco;
    int taxa;
    Jogador proprietario;
    
    protected Propriedade(String nome, int preco, int taxa){
        this.nome = nome;
        this.taxa = taxa;
        this.preco = preco;
        this.preco = preco;
        proprietario = null;
    }
    
    public void setProprietario(Jogador proprietario) {
    	this.proprietario = proprietario;
    }
    
    public void acao(Jogador jogador){
   
    }
    
    public void pagarTaxa(Jogador jogador) {
    	if(jogador != this.proprietario) {
    		if(jogador.getSaldo() >= this.taxa) {
    			jogador.setSaldo(jogador.getSaldo()-this.preco);
    		}
    	}
    }
    
    public void comprarPropriedade(Jogador jogador) {
    	if(jogador != this.proprietario) {
    		if(jogador.getSaldo() >= this.preco) {
    			jogador.setSaldo(jogador.getSaldo()-this.preco);
    			this.proprietario = jogador;
    		}
    	}
    }
    
}
