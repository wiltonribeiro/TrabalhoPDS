package pojo;

import interfaces.Casa;
import java.util.List;
import sun.security.jca.GetInstance;

class Tabuleiro {    
    private static Tabuleiro tabuleiro;
    private List<Casa> casas;
    private List<Carta> cartas;   
    private int tamanho;
    private InicializadorCasas inicializadorCasa;
    private InicializadorCartas inicializadorCarta;
    
    public static Tabuleiro getInstance(){
        if (tabuleiro == null) tabuleiro = new Tabuleiro();
        return tabuleiro;
    }
    
    private Tabuleiro(){
        inicializadorCasa = InicializadorCasas.getInstance();
        inicializadorCarta = InicializadorCartas.getInstance();
        casas = inicializadorCasa.getCasas();
        cartas = inicializadorCarta.getCartas();
        tamanho = casas.size();
    }
    
    public Casa obterCasaInicial(){
        return casas.get(0);
    }
    
    public Casa obterCasa(Casa localizacao, int valorDados){
        int casaAtual = casas.indexOf(localizacao);
        int proximaCasa = (casaAtual+valorDados)%tamanho;               
        return casas.get(proximaCasa);
    }    
    
    public Carta tirarCarta(){
        Carta carta = cartas.get(cartas.size()-1);
        cartas.remove(carta);
        cartas.add(0, carta);        
        return carta;
    }
    
}
