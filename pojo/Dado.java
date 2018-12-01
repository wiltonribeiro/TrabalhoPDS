package pojo;

import java.util.Random;

public class Dado {
    private int valor;
    private int max;
    
    public Dado(int max){
        this.max = max;
    }
    
    public void lancar(){
        Random random = new Random();
        this.valor = random.nextInt(max)+1;
    }
    
    public int getValor(){
        return valor;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    
      
}
