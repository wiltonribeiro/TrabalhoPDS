package pojo.Terrenos;

import interfaces.Terreno;
import pojo.Jogador;

public class TerrenoVermelho extends Terreno {

    public TerrenoVermelho(String nome, int preco, int aluguel, int umaCasa, int duasCasas, int tresCasas, int quatroCasas, int hotel, int x, int y, int construirCasa) {
        super(nome, preco, aluguel, umaCasa, duasCasas, tresCasas, quatroCasas, hotel, x, y, construirCasa);
    }    
}
