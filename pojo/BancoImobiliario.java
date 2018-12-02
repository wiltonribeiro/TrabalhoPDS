package pojo;

import JGamePlay.GameImage;
import interfaces.Casa;
import java.util.ArrayList;
import java.util.List;

public class BancoImobiliario {
    private List<Jogador> jogadores;
    private Tabuleiro tabuleiro;
    private Copo copo;   
    private int numJogadores;   
    private ArrayList<Peca> pecas;
    

    public BancoImobiliario() {        
        copo = Copo.getInstance(2);      
        jogadores = new ArrayList<>();
        numJogadores = 0;        
        tabuleiro = Tabuleiro.getInstance();
        pecas = new ArrayList<>();
        criarPecas();
    }
    
    public boolean jogoAcabou(){        
        return jogadores.size() == 1;
    }
    
    public void realizarJogada(){
        List<Jogador> jogadoresParaSair = new ArrayList<>();
        for(Jogador jogador: jogadores){                                              
            if(jogador.getSaldo() > 0)
                jogador.movimentarJogador();           
            else
                jogadoresParaSair.add(jogador);                       
        }
        
        for(Jogador jogador: jogadoresParaSair)
            jogadores.remove(jogador);
        
        jogadoresParaSair.clear();
    }
    
    public void addJogador(String nome){
        Casa casaInicial = tabuleiro.obterCasaInicial();
        Peca peca = pecas.get(0);      
        
        jogadores.add(new Jogador(casaInicial, 2458, nome, copo, tabuleiro,peca));
        pecas.remove(peca);
        numJogadores++;             
    }    
    
    public void criarPecas(){
        for(int i=0; i<6; i++){
            pecas.add(new Peca("src//recursos//sprite//pecas//peca"+(i+1)+".png"));
        }
    }
    
    public ArrayList<Peca> getPecas(){        
        return pecas;
    }
    
    public Jogador getVencedor(){
        return jogadores.get(0);
    }
      
}
