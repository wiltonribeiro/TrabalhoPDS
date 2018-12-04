package pojo;

import inicializador.InicializadorPecas;
import JGamePlay.GameImage;
import interfaces.Casa;
import java.util.ArrayList;
import java.util.List;

public class BancoImobiliario {
    private List<Jogador> jogadores;    
    private Copo copo;   
    private int numJogadores;   
    private ArrayList<Peca> pecas;
    private static BancoImobiliario bancoImobiliario;
    

    private BancoImobiliario() {        
        copo = Copo.getInstance(2);      
        jogadores = new ArrayList<>();
        numJogadores = 0;                
        pecas = new InicializadorPecas().getPecas();
    }
    
    public static BancoImobiliario getInstance(){
        if(bancoImobiliario == null){
            bancoImobiliario = new BancoImobiliario();
        }
        return bancoImobiliario;
    }
    
    public boolean jogoAcabou(){        
        return jogadores.size() == 1;
    }
    
    public void realizarJogada(){
        List<Jogador> jogadoresParaSair = new ArrayList<>();
        for(Jogador jogador: jogadores){                                              
            if(jogador.getSaldo() > 0)
                jogador.realizaJogada();            
            else
                jogadoresParaSair.add(jogador);                       
        }
        
        for(Jogador jogador: jogadoresParaSair)
            jogadores.remove(jogador);
        
        jogadoresParaSair.clear();
    }
    
    public void addJogador(String nome){
        Casa casaInicial = Tabuleiro.getInstance().obterCasaInicial();
        Peca peca = pecas.get(0);      
        
        jogadores.add(new Jogador(casaInicial, 2458, nome, copo,peca));
        pecas.remove(peca);
        numJogadores++;             
    }    
    
    public ArrayList<Peca> getPecas(){        
        return pecas;
    }
    
    public List<Jogador> getJogadores(){        
        return jogadores;
    }
    
    public Jogador getVencedor(){
        return jogadores.get(0);
    }
      
}
