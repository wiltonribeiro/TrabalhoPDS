package pojo.Cartas;

import interfaces.Casa;

import controle.ControladorMenssagem;
import pojo.Carta;
import pojo.Jogador;
import pojo.Tabuleiro;

public class VaPrisao implements AcaoCarta{

    @Override
    public void acaoCarta(Carta carta, Jogador jogador) {
    	ControladorMenssagem.getInstance().showMessageDialog(carta.getDescricao());
        Casa prisao = Tabuleiro.getInstance().obterCasaPrisao();
        jogador.setLocalizacao(prisao);

        jogador.setPreso(true);
        jogador.devolverCarta(carta);
    }


}
