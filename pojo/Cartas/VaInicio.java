package pojo.Cartas;

import pojo.Tabuleiro;
import interfaces.Casa;
import javax.swing.JOptionPane;
import pojo.Carta;
import pojo.Jogador;

public class VaInicio implements AcaoCarta{

    @Override
    public void acaoCarta(Carta carta, Jogador jogador) {               
        JOptionPane.showMessageDialog(null, carta.getDescricao());
        Casa inicio = Tabuleiro.getInstance().obterCasaInicial();
        jogador.setLocalizacao(inicio);
        jogador.bonusDaRodada();
        jogador.devolverCarta(carta);
    }
    
}
