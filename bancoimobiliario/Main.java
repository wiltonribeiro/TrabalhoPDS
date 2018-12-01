package bancoimobiliario;

import JGamePlay.GameImage;
import JGamePlay.Keyboard;
import JGamePlay.Mouse;
import JGamePlay.Window;
import java.awt.Dimension;

public class Main {

    public static void main(String[] args) {
        Window janela = new Window(700,700);        
        Keyboard keyboard = janela.getKeyboard();        
        
        GameImage[] pecas;       
        pecas = new GameImage[6];
        
        for(int i=0; i<6; i++)
            pecas[i] = new GameImage("src//recursos//sprite//pecas//peca"+(i+1)+".png");
        
        GameImage backGround = new GameImage("src//recursos//sprite//fundo.jpg");        

        boolean executando = true;
        while(executando)
        {
                backGround.draw();                
                for(int i=0; i<6; i++) pecas[i].draw();
                janela.display();                                                 

                if ( keyboard.keyDown(Keyboard.ESCAPE_KEY) == true)
                    executando = false;
        }
        janela.exit();
    }
    
}
