package pojo;

import interfaces.Casa;
import java.util.ArrayList;
import java.util.List;
import pojo.Casas.Inicio;

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
    }
    
    public List<Casa> getCasas(){
        return casas;
    }
}
