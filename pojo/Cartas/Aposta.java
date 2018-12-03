package pojo.Cartas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pojo.Carta;
import pojo.Jogador;
import pojo.BancoImobiliario;

public class Aposta implements AcaoCarta{
    private List<Jogador> jogadores;    

    @Override
    public void acaoCarta(Carta carta, Jogador jogador) {
        jogadores = BancoImobiliario.getInstance().getJogadores();        
        jogador.setSaldo(jogador.getSaldo() + jogadores.size() * 50);
        jogadores.forEach((j) -> {
            j.setSaldo(j.getSaldo() - 50);
        });
        JOptionPane.showMessageDialog(null, carta.getDescricao());
        jogador.devolverCarta(carta);
    }   
  
}
