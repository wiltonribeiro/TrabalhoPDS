package controle;

import JGamePlay.GameImage;
import JGamePlay.Window;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pojo.BancoImobiliario;

public class ControladorJogo {
    public BancoImobiliario banco;  
    private Window janela;
                    
    public ControladorJogo(Window janela) {
        banco = new BancoImobiliario(); 
        this.janela = janela;
    }
        
    
    public void iniciar(){
        String entrada = JOptionPane.showInputDialog("Qual a quantidade de jogadores ?");
        if(entrada != null){
            int numJogadores = Integer.parseInt(entrada);
            darInicio(numJogadores);
        }
        
    }
    
    public void darInicio(int numJogadores){        
        if(numJogadores<=6 && numJogadores>=2){
            for(int i = 0; i < numJogadores; i++){                
                  String nome = JOptionPane.showInputDialog("Qual seu nome jogador "+(i+1)+" ?");
                  banco.addJogador(nome);
            }
            
            iniciarJogada();
        } else iniciar();
    }
    
    public void iniciarJogada(){
        janela.display();
        while(!banco.jogoAcabou()){
            banco.realizarJogada();
        }
    }
    
    
}
