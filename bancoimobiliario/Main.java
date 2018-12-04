package bancoimobiliario;

import JGamePlay.GameImage;
import JGamePlay.Keyboard;
import JGamePlay.Mouse;
import JGamePlay.Window;
import controle.ControladorJogo;
import java.awt.Dimension;
import pojo.Tela;

public class Main {


    public static void main(String[] args) {
        ControladorJogo controladorJogo = new ControladorJogo();                                       
        controladorJogo.iniciar();                      
    }
    
}
