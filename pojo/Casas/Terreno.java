package pojo.Casas;

import pojo.Jogador;

public class Terreno extends Propriedade{
    int umaCasa;
    int duasCasas;
    int tresCasas;
    int quatroCasas;
    int hotel;
    int qtdCasas;
    int aluguel;
    
    public Terreno(String nome, int valor, int umaCasa, int duasCasas, int tresCasas, int quatroCasas, int hotel) {
        super(nome, valor);
        this.umaCasa = umaCasa;
        this.duasCasas = duasCasas;
        this.tresCasas = tresCasas;
        this.quatroCasas = quatroCasas;
        this.hotel = hotel;
    }

    @Override
    public void acao(Jogador jogador) {
        
    }
    
    
    
}