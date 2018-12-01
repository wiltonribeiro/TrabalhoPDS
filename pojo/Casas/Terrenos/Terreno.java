package pojo.Casas.Terrenos;

import pojo.Casas.Propriedade;
import pojo.Jogador;

public abstract class Terreno extends Propriedade{
    int umaCasa;
    int duasCasas;
    int tresCasas;
    int quatroCasas;
    int hotel;
    int qtdCasas;
    int construirCasa;
    
    public Terreno(String nome, int preco, int aluguel, int umaCasa, int duasCasas, int tresCasas, int quatroCasas, int hotel, int x, int y, int construirCasa) {
        super(nome, preco, aluguel, x, y);
        this.umaCasa = umaCasa;
        this.duasCasas = duasCasas;
        this.tresCasas = tresCasas;
        this.quatroCasas = quatroCasas;
        this.hotel = hotel;
        this.construirCasa = construirCasa;
    }  
    
}
