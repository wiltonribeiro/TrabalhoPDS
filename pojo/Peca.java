package pojo;

import JGamePlay.GameImage;

public class Peca extends GameImage {
    
    public Peca(String fileName) {
        super(fileName);
    }
    
    public void acao(int x, int y){
        Tela.getInstace().drawBackground();
        this.setPosition(x, y);
        Tela.getInstace().drawPeca(this);
        Tela.getInstace().displayWindow();
    }
}
