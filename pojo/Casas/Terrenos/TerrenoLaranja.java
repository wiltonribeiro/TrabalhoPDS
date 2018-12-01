package pojo.Casas.Terrenos;

import pojo.Jogador;

public class TerrenoLaranja extends Terreno {

    public TerrenoLaranja(String nome, int preco, int aluguel, int umaCasa, int duasCasas, int tresCasas, int quatroCasas, int hotel, int x, int y, int construirCasa) {
        super(nome, preco, aluguel, umaCasa, duasCasas, tresCasas, quatroCasas, hotel, x, y, construirCasa);
    }
    
  
    @Override
    public void acao(Jogador jogador) {
        
    }
    
    
    
}
