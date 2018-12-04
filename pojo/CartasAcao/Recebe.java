package pojo.CartasAcao;

import interfaces.AcaoCarta;
import controle.ControladorMenssagem;
import pojo.Carta;
import pojo.Jogador;

public class Recebe implements AcaoCarta{
    
    private int valor;

    public Recebe(int valor) {
        this.valor = valor;
    }    

    public int getValor() {
        return valor;
    }

    @Override
    public void acaoCarta(Carta carta, Jogador jogador) {
    	ControladorMenssagem.getInstance().showMessageDialog("Carta:\n"+carta.getDescricao()+"\nRecebe: "+this.valor);
        jogador.setSaldo(jogador.getSaldo()+this.valor);
        jogador.devolverCarta(carta);
    }
        
}
