package pojo.Casas;

import interfaces.Casa;
import pojo.Carta;
import pojo.Jogador;

public class SorteReves implements Casa{

    @Override
    public void acao(Jogador jogador) {
        Carta carta = jogador.tirarCarta();
        jogador.setSaldo(jogador.getSaldo()+carta.getValor());
    }
    
}
