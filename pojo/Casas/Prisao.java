package pojo.Casas;

import interfaces.Casa;
import pojo.Jogador;

public class Prisao implements Casa{

    @Override
    public void acao(Jogador jogador) {
     
    }

    @Override
    public int getX() {
        return 605;
    }

    @Override
    public int getY() {
        return 605;
    }
    
}
