package pojo;

import interfaces.Casa;
import java.util.ArrayList;
import java.util.List;
import pojo.Casas.Companhia;
import pojo.Casas.ImpostoRenda;
import pojo.Casas.Inicio;
import pojo.Casas.LucroDividendo;
import pojo.Casas.ParadaLivre;
import pojo.Casas.Prisao;
import pojo.Casas.SorteReves;
import pojo.Casas.Terrenos.TerrenoAmarelo;
import pojo.Casas.Terrenos.TerrenoAzulClaro;
import pojo.Casas.Terrenos.TerrenoAzulEscuro;
import pojo.Casas.Terrenos.TerrenoLilas;
import pojo.Casas.Terrenos.TerrenoRoxo;
import pojo.Casas.Terrenos.TerrenoLaranja;
import pojo.Casas.Terrenos.TerrenoVerde;
import pojo.Casas.Terrenos.TerrenoVermelho;
import pojo.Casas.VaParaPrisao;

public class InicializadorCasas {
    private static InicializadorCasas inicializadorCasas;
    private List<Casa> casas;
    
    private InicializadorCasas(){
        casas = new ArrayList<>();
        inicializarCasas();
    }
    
    public static InicializadorCasas getInstance(){
        if (inicializadorCasas == null)
            inicializadorCasas = new InicializadorCasas();
        return inicializadorCasas;
    }
    
    private void inicializarCasas(){
        casas.add(new Inicio());
        casas.add(new TerrenoLilas("Leblon", 100, 6, 30, 90, 270, 400, 500, 0, 0, 50));
        casas.add(new SorteReves(0, 0));
        casas.add(new TerrenoLilas("Av. Presidente Vargas", 60, 2, 10, 30, 90, 160, 250, 0, 0, 50));
        casas.add(new TerrenoLilas("Av. Nossa S. de Copacabana", 60, 4, 20, 60, 180, 320, 450, 0, 0, 50));
        casas.add(new Companhia("Companhia ferroviaria", 200, 50, 0, 0));
        casas.add(new TerrenoAzulClaro("Av. Brigadeiro Farias Lima", 200, 20, 100, 300, 750, 925, 1100, 0, 0, 150));
        casas.add(new Companhia("Companhia de viação", 200, 50, 0, 0));
        casas.add(new TerrenoAzulClaro("Av. Rebouças", 220, 18, 90, 250, 700, 875, 1050, 0, 0, 150));
        casas.add(new TerrenoAzulClaro("Av. 9 de julho", 220, 18, 90, 250, 700, 875, 1050, 0, 0, 150));
        casas.add(new Prisao());
        casas.add(new TerrenoRoxo("Avenida Europa", 200,16, 80, 220, 600, 800, 1000, 0, 0, 100));
        casas.add(new SorteReves(0,0));
        casas.add(new TerrenoRoxo("Rua Augusta", 180, 14, 70, 200, 550, 750, 950, 0, 0, 100));
        casas.add(new TerrenoRoxo("Avenida Pacaembu", 180, 14, 70, 200, 550, 750, 950, 0, 0, 100));
        casas.add(new Companhia("Companhia de Taxi", 150, 40, 0, 0));
        casas.add(new SorteReves(0,0));
        casas.add(new TerrenoLaranja("Interlagos", 350, 35, 175, 500, 1100, 1300, 1500, 0, 0, 200));
        casas.add(new LucroDividendo());
        casas.add(new TerrenoLaranja("Morumbi", 400, 50, 200, 600, 1400, 1700, 2000, 0, 0, 200));
        casas.add(new ParadaLivre());
        casas.add(new TerrenoVermelho("Flamengo", 120, 8, 40, 100, 300, 450, 600, 0, 0, 50));
        casas.add(new SorteReves(0, 0));
        casas.add(new TerrenoVermelho("Botafogo", 100, 6, 30, 90, 270, 400, 500, 0, 0, 50));
        casas.add(new ImpostoRenda());
        casas.add(new Companhia("Companhia de navegação", 150, 40, 0, 0));
        casas.add(new TerrenoAmarelo("Avenia Brasil", 150, 12, 60, 180, 500, 700, 900, 0, 0, 100));
        casas.add(new SorteReves( 0, 0));
        casas.add(new TerrenoAmarelo("Avenida Paulista", 140, 10, 50, 150, 450, 625, 750, 0, 0, 100));
        casas.add(new TerrenoAmarelo("Jardim Europa", 140, 10, 50, 150, 450, 625, 750, 0, 0, 100));
        casas.add(new VaParaPrisao());
        casas.add(new TerrenoVerde("Copacabana", 260, 22, 110, 330, 800, 975, 1150, 0, 0, 150));
        casas.add(new Companhia("Companhia de aviação", 200, 50, 0, 0));
        casas.add(new TerrenoVerde("Avenida Vieira Souto", 320, 28, 150, 450, 1000, 1200, 1400, 0, 0, 200));
        casas.add(new TerrenoVerde("Avenida Atlantica", 300, 26, 130, 390, 900, 1100, 1275, 0, 0, 200));
        casas.add(new Companhia("Companhia de Taxi Aéreo", 200, 50, 0, 0));
        casas.add(new TerrenoVerde("Ipanema", 300, 26, 130, 390, 900, 1100, 1275, 0, 0, 200));
        casas.add(new SorteReves( 0, 0));
        casas.add(new TerrenoAzulEscuro("Jardim Paulista", 280, 24, 120, 360, 850, 1025, 1200, 0, 0, 150));
        casas.add(new TerrenoAzulEscuro("Brooklin", 260, 22, 110, 330, 800, 975, 1150, 0, 0, 150));

    }
    
    public List<Casa> getCasas(){
        return casas;
    }
}
