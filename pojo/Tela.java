
package pojo;

import JGamePlay.GameImage;
import JGamePlay.Keyboard;
import JGamePlay.Window;

public class Tela {
    private static Tela tela;
    private Window janela;        
    private Keyboard keyboard;                             
    private GameImage backGround;        
    
    private Tela(){
        janela = new Window(700,700);        
        keyboard = janela.getKeyboard();                             
        backGround = new GameImage("recursos//sprite//fundo.jpg");
    }
    
    public void drawBackground(){
        backGround.draw();
    }
    
    public void displayWindow(){
       janela.display();
    }
    
    public void drawPeca(Peca peca){
        peca.draw();
    }
    
    public static Tela getInstace(){
        if(tela == null) tela = new Tela();
        return tela;
    }
    
}
