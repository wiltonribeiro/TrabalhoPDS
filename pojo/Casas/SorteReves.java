package pojo.Casas;

import interfaces.Casa;
import pojo.Carta;
import pojo.Jogador;

public class SorteReves implements Casa{
    private int x, y;

    public SorteReves(int x, int y) {
        this.x = x;
        this.y = y;
    }       

    @Override
    public void acao(Jogador jogador) {
        Carta carta = jogador.tirarCarta();
        jogador.setSaldo(jogador.getSaldo()+carta.getValor());
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
    
}
