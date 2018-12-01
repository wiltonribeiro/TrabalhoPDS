package pojo;

import interfaces.Casa;
import java.util.ArrayList;
import java.util.List;

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
        casas.add();
    }
    
    public List<Casa> getCasas(){
        return casas;
    }
}
