package controle;

import JGamePlay.GameImage;
import JGamePlay.Window;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pojo.BancoImobiliario;
import pojo.Tela;

public class ControladorJogo {
    public BancoImobiliario banco;  
                    
    public ControladorJogo() {
        banco = BancoImobiliario.getInstance();         
    }        
    
    public void iniciar(){
    	try {
    		String entrada = ControladorMenssagem.getInstance().showInputDialog("Qual a quantidade de jogadores ?");
	        if(entrada != null){
	            int numJogadores = Integer.parseInt(entrada);
	            darInicio(numJogadores);
	        }
    	}catch(Exception e) {
    		ControladorMenssagem.getInstance().showMessageDialog("Informe uma quantidade válida de jogadores");
    	}
    }
    
    public void darInicio(int numJogadores){        
        Tela.getInstace().drawBackground();
        if(numJogadores<=6 && numJogadores>=2){
            for(int i = 0; i < numJogadores; i++){                
                  String nome = ControladorMenssagem.getInstance().showInputDialog("Qual seu nome jogador "+(i+1)+" ?");
                  banco.addJogador(nome);
            }            
            iniciarJogada();
        } else iniciar();
    }
    
    public void iniciarJogada(){        
        Tela.getInstace().displayWindow();
        while(!banco.jogoAcabou()){
            banco.realizarJogada();            
        }
        ControladorMenssagem.getInstance().showMessageDialog("O jogador "+banco.getVencedor().getNome()+" venceu");
    }        
}
