package pojo.Casas;

import interfaces.Casa;
import controle.ControladorMenssagem;
import pojo.Jogador;
import pojo.Tabuleiro;

public class VaParaPrisao implements Casa{

    @Override
    public void acao(Jogador jogador) {
    	ControladorMenssagem.getInstance().showMessageDialog("Perdeu playboy! Você vai para a prisão.");
        Casa prisao = Tabuleiro.getInstance().obterCasaPrisao();
        jogador.setLocalizacao(prisao);
        jogador.setPreso(true);
        
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
