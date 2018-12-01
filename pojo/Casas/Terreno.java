package pojo.Casas;

import pojo.Jogador;

public class Terreno extends Propriedade{
    int umaCasa;
    int duasCasas;
    int tresCasas;
    int quatroCasas;
    int hotel;
    int qtdCasas;
    
    public Terreno(String nome, int preco, int aluguel, int umaCasa, int duasCasas, int tresCasas, int quatroCasas, int hotel, int x, int y) {
        super(nome, preco, aluguel, x, y);
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
