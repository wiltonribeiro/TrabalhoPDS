package bancoimobiliario;

import JGamePlay.GameImage;
import JGamePlay.Keyboard;
import JGamePlay.Mouse;
import JGamePlay.Window;
import controle.ControladorJogo;
import java.awt.Dimension;

public class Main {

    public static void main(String[] args) {
        Window janela = new Window(700,700);        
        Keyboard keyboard = janela.getKeyboard();                             
        GameImage backGround = new GameImage("src//recursos//sprite//fundo.jpg");        
        ControladorJogo controladorJogo = new ControladorJogo(janela);                
        
        backGround.draw();                                
        controladorJogo.iniciar();                      
    }
    
}
