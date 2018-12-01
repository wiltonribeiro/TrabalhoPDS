package pojo.Casas;

import interfaces.Casa;
import pojo.Jogador;

public class LucroDividendo implements Casa{

    @Override
    public void acao(Jogador jogador) {
        jogador.setSaldo(jogador.getSaldo()+200);
    }
    
}
