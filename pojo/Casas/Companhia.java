package pojo.Casas;

import pojo.Jogador;

public class Companhia extends Propriedade{
    int taxa;

    public Companhia(String nome, int valor, int taxa) {
        super(nome, valor);
        this.taxa = taxa;
    }

    @Override
    public void acao(Jogador jogador) {
       
    }

}
