package pojo.Casas.Terrenos;

import javax.swing.JOptionPane;
import pojo.Casas.Propriedade;
import pojo.Jogador;

public abstract class Terreno extends Propriedade{
    int umaCasa;
    int duasCasas;
    int tresCasas;
    int quatroCasas;
    int hotel;
    int qtdCasas;
    int construirCasa;
    
    public Terreno(String nome, int preco, int aluguel, int umaCasa, int duasCasas, int tresCasas, int quatroCasas, int hotel, int x, int y, int construirCasa) {
        super(nome, preco, aluguel, x, y);
        this.umaCasa = umaCasa;
        this.duasCasas = duasCasas;
        this.tresCasas = tresCasas;
        this.quatroCasas = quatroCasas;
        this.hotel = hotel;
        this.construirCasa = construirCasa;
    }         

    @Override
    public void pagarTaxa(Jogador jogador) {
        
        Jogador proprietario = this.getProprietario();        
        int valorPagar = this.getTaxa();
        
        if(proprietario != null){                        
            if(qtdCasas == 1) valorPagar = umaCasa;
            else if(qtdCasas == 2) valorPagar = duasCasas;
            else if(qtdCasas == 3) valorPagar = tresCasas;
            else if(qtdCasas == 4) valorPagar = quatroCasas;
            else if(qtdCasas >= 5) valorPagar = hotel;
                
            if(jogador.getSaldo() >= valorPagar){
                jogador.setSaldo(jogador.getSaldo()-valorPagar);
                proprietario.setSaldo(proprietario.getSaldo()+valorPagar);
            }  else{
                proprietario.setSaldo(proprietario.getSaldo()+jogador.getSaldo());
                jogador.setSaldo(0);
            }                                                                 
        } else jogador.setSaldo(jogador.getSaldo()-valorPagar);        
            
    }
    
    public boolean checarSePodeConstruir(Class t){
        return checarSePodeConstruirPelaQuantidade(t) && checarSePodeConstruirPeloTerreno(t);
    }
    
    private boolean checarSePodeConstruirPeloTerreno(Class t){
        return this.getProprietario().possuoTodasOsTerrenos(t);     
    }
    
    private boolean checarSePodeConstruirPelaQuantidade(Class t){
        int min = 5;
        for(Propriedade propriedade: this.getProprietario().getPropriedades()){
             if(t.isInstance(propriedade)){
                if(this.qtdCasas<min)
                    min = this.qtdCasas;
            }
        }        
               
        return min == this.qtdCasas;
    }
    
    public void construirCasa(Class t){
       qtdCasas++;
    }
        

    @Override
    public void acao(Jogador jogador) {
        
        if(this.getProprietario() == null){            
            int resposta = JOptionPane.NO_OPTION;            
            if(jogador.getSaldo()>= this.getPreco())
                resposta = JOptionPane.showConfirmDialog(null, "Deseja comprar o terreno "+this.getNome()+"?");                        
            if(resposta == JOptionPane.YES_OPTION) this.comprarPropriedade(jogador);
            else this.pagarTaxa(jogador);
            
        } else if(this.getProprietario().equals(jogador) && jogador.getSaldo()>= this.construirCasa && checarSePodeConstruir(this.getClass())){
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja construir uma casa ?");                        
            if(resposta == JOptionPane.YES_OPTION) this.construirCasa(this.getClass());
            else this.pagarTaxa(jogador);
        } else {
             this.pagarTaxa(jogador);
        }                        
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ " Nome: "+this.getNome()+" qtdCasas:" + qtdCasas;
    }
    
    

    
}
