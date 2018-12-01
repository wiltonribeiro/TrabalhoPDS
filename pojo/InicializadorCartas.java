package pojo;

import java.util.ArrayList;
import java.util.List;

public class InicializadorCartas {    
    public static InicializadorCartas inicializadorCarta;
    private List<Carta> cartas;
    
    public static InicializadorCartas getInstance(){
        if(inicializadorCarta==null){
            inicializadorCarta = new InicializadorCartas();
        }
        
        return inicializadorCarta;
    }
    
    private InicializadorCartas(){
        cartas = new ArrayList<>();
        inicializarCartas();
    }
    
    private void inicializarCartas(){
        cartas.add(new Carta("", 0));
    }
    
    public List<Carta> getCartas(){
        return cartas;
    }
}
