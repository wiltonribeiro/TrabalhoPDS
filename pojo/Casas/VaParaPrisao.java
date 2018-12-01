package pojo.Casas;

import interfaces.Casa;
import pojo.Jogador;

public class VaParaPrisao implements Casa{

    @Override
    public void acao(Jogador jogador) {
        
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }
    
}
