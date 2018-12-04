package pojo.CartasAcao;

import interfaces.AcaoCarta;
import controle.ControladorMenssagem;
import pojo.Carta;
import pojo.Jogador;

public class Paga implements AcaoCarta{
    
    private int valor;

    public Paga(int valor) {
        this.valor = valor;
    }    

    public int getValor() {
        return valor;
    }

    @Override
    public void acaoCarta(Carta carta, Jogador jogador) {
    	ControladorMenssagem.getInstance().showMessageDialog("Carta:\n"+carta.getDescricao()+"\nPaga: "+this.valor);
        jogador.setSaldo(jogador.getSaldo()-this.valor);
        jogador.devolverCarta(carta);
    }

}