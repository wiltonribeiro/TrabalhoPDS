package pojo.Cartas;

import interfaces.Casa;
import javax.swing.JOptionPane;
import pojo.Carta;
import pojo.Jogador;
import pojo.Tabuleiro;

public class VaPrisao implements AcaoCarta{

    @Override
    public void acaoCarta(Carta carta, Jogador jogador) {
        JOptionPane.showMessageDialog(null, carta.getDescricao());
        Casa prisao = Tabuleiro.getInstance().obterCasaPrisao();
        jogador.setLocalizacao(prisao);
        prisao.acao(jogador);
        jogador.devolverCarta(carta);
    }


}
