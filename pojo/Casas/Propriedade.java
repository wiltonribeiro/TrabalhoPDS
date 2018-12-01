package pojo.Casas;

import interfaces.Casa;

public abstract class Propriedade implements Casa{
    String nome;
    int preco;
    
    protected Propriedade(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    }
}
