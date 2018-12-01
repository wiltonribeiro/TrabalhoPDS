package pojo.Casas;

import interfaces.Casa;
import pojo.Jogador;

public abstract class Propriedade implements Casa{
    private String nome;
    private int preco;
    private int taxa, x, y;
    private Jogador proprietario;
    
    protected Propriedade(String nome, int preco, int taxa, int x, int y){
        this.nome = nome;
        this.taxa = taxa;
        this.preco = preco;       
        this.x = x;
        this.y = y;        
        proprietario = null;
    }
    
    public void setProprietario(Jogador proprietario) {
    	this.proprietario = proprietario;
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
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
}
