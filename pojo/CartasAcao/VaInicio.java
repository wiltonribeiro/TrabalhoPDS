package pojo.CartasAcao;

import interfaces.AcaoCarta;
import pojo.Tabuleiro;
import interfaces.Casa;

import controle.ControladorMenssagem;
import pojo.Carta;
import pojo.Jogador;

public class VaInicio implements AcaoCarta{

    @Override
    public void acaoCarta(Carta carta, Jogador jogador) {               
    	ControladorMenssagem.getInstance().showMessageDialog(carta.getDescricao());
        Casa inicio = Tabuleiro.getInstance().obterCasaInicial();
        jogador.setLocalizacao(inicio);
        jogador.bonusDaRodada();
        jogador.devolverCarta(carta);
    }
    
}
