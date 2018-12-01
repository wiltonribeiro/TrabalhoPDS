package pojo;

import interfaces.Casa;
import java.util.ArrayList;
import java.util.List;

public class BancoImobiliario {
    private List<Jogador> jogadores;
    private Tabuleiro tabuleiro;
    private Copo copo;   
    private int numJogadores;   

    public BancoImobiliario() {        
        copo = Copo.getInstance(2);      
        jogadores = new ArrayList<>();
        numJogadores = 0;        
        tabuleiro = Tabuleiro.getInstance();
    }
    
    public boolean jogoAcabou(){
        return jogadores.size() == 1;
    }
    
    public void realizarJogada(){                     
        for(Jogador jogador: jogadores){
            if(jogador.getSaldo() > 0)
                jogador.movimentarJogador();
            else
                jogadores.remove(jogador);
        }
    }
    
    public void addJogador(String nome){
        Casa casaInicial = tabuleiro.obterCasaInicial();
        jogadores.add(new Jogador(casaInicial, 2458, nome, copo, tabuleiro));
        numJogadores++;             
    }    
      
}
