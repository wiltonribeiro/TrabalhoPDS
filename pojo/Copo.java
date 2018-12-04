package pojo;

import java.util.ArrayList;
import java.util.List;

public class Copo {
    private List<Dado> dados;
    private int qntdDados;
    private int total;
    private static Copo copo;    
    
    public static Copo getInstance(int qntd){
        if(copo == null){
            copo = new Copo(qntd);
        }
        return copo;
    }
    
    private Copo(int qntdDados) {        
        dados = new ArrayList<>();
        this.qntdDados = qntdDados;
        for(int i = 0; i < qntdDados; i++)
            dados.add(new Dado(6));
    }
    
    public void lancarDados(){
        for(Dado dado: dados){
            dado.lancar();
        }
    }
    
    public int obterTotal(){
        total = 0;
        for(Dado dado: dados){
            total += dado.getValor();
        }
        return total;
    }
    
    public boolean verificaDupla(){
        boolean dupla = true;
        
        for(Dado dado: dados)
            if(dados.get(0).getValor() != dado.getValor()){
                dupla = false;
                break;
            }                                     
                
        return dupla;
    }
    
    
    public int quantidadeDados(){
        return dados.size();
    }
}
