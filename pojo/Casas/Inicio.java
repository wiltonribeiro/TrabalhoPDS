package pojo.Casas;

import interfaces.Casa;
import pojo.Jogador;

public class Inicio implements Casa{
    @Override
    public void acao(Jogador jogador) {
        jogador.setSaldo(jogador.getSaldo()+150);
    }        

    @Override
    public int getX() {
        return 605;
    }

    @Override
    public int getY() {
        return 0;
    }
}
