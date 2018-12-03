package pojo.Cartas;

import javax.swing.JOptionPane;
import pojo.Carta;
import pojo.Jogador;

public class SairPrisao implements AcaoCarta {

    @Override
    public void acaoCarta(Carta carta, Jogador jogador) {
        JOptionPane.showMessageDialog(null, carta.getDescricao());
        jogador.guardarCartaSairPrisao(carta);
    }
    
}
