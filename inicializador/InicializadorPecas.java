
package inicializador;

import java.util.ArrayList;
import pojo.Peca;

public class InicializadorPecas {
    private ArrayList<Peca> pecas;
    
    public InicializadorPecas(){
        pecas = new ArrayList<>();
        criarPecas();
    }
    
    private void criarPecas(){
        for(int i=0; i<6; i++){
            pecas.add(new Peca("recursos//sprite//pecas//peca"+(i+1)+".png"));
        }
    }
    
    public ArrayList<Peca> getPecas(){
        return pecas;
    }
}
