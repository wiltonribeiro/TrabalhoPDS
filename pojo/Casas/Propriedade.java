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
        this.proprietario = null;
    }
    
    public abstract void pagarTaxa(Jogador jogador);        
    
    public void comprarPropriedade(Jogador jogador) {
        
        //realizando a compra
        jogador.setSaldo(jogador.getSaldo()-this.preco);
    	jogador.addPropriedade(this);        
        this.proprietario = jogador;
    }
    
    public Jogador getProprietario(){
        return proprietario;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getTaxa() {
        return taxa;
    } 
}
