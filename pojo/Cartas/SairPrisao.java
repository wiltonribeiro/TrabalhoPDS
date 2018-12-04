package pojo.Cartas;

import controle.ControladorMenssagem;
import pojo.Carta;
import pojo.Jogador;

public class SairPrisao implements AcaoCarta {

    @Override
    public void acaoCarta(Carta carta, Jogador jogador) {
    	ControladorMenssagem.getInstance().showMessageDialog(carta.getDescricao());
        jogador.guardarCartaSairPrisao(carta);
    }
    
}
