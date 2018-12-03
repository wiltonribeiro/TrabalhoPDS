package pojo.Casas;

import interfaces.Casa;
import javax.swing.JOptionPane;
import pojo.Jogador;
import pojo.Tabuleiro;

public class VaParaPrisao implements Casa{

    @Override
    public void acao(Jogador jogador) {
        JOptionPane.showMessageDialog(null, "Perdeu playboy! Você vai para a prisão.");
        Casa prisao = Tabuleiro.getInstance().obterCasaPrisao();
        jogador.setLocalizacao(prisao);
        prisao.acao(jogador);
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
