package pojo.Casas;

import javax.swing.JOptionPane;
import pojo.Copo;
import pojo.Jogador;

public class Companhia extends Propriedade{
    private int taxa;

    public Companhia(String nome, int valor, int taxa, int x, int y) {
        super(nome, valor, taxa, x, y);
        this.taxa = taxa;        
    }

    @Override
    public void acao(Jogador jogador) {
        
        //avisar que caiu na companhia
        if(this.getProprietario() == null){
            int resposta = JOptionPane.NO_OPTION;
            
            if(jogador.getSaldo()>= this.getPreco())
                resposta = JOptionPane.showConfirmDialog(null, "Deseja comprar a companhia "+this.getNome()+"?");
                        
            if(resposta == JOptionPane.YES_OPTION) this.comprarPropriedade(jogador);
            else {
                int valorTaxa = calcularTaxa(jogador);
                jogador.setSaldo(jogador.getSaldo()-valorTaxa);
            }
            
        } else if(!this.getProprietario().equals(jogador)) pagarTaxa(jogador);
        else{
            //faz nada casa seja dono da companhia ?
        }
       
    }
    
    public int calcularTaxa(Jogador jogador) {
    	return jogador.getValorDados() * this.taxa;
    } 

    @Override
    public void pagarTaxa(Jogador jogador) {
        Jogador proprietario = this.getProprietario();
        int valorTaxa = calcularTaxa(jogador);
        
        if(jogador.getSaldo()>= valorTaxa){
            jogador.setSaldo(jogador.getSaldo()-valorTaxa);
            proprietario.setSaldo(proprietario.getSaldo()+valorTaxa);
        } else{
            jogador.setSaldo(0);
            proprietario.setSaldo(proprietario.getSaldo()+jogador.getSaldo());
        }                
    }

    @Override
    public String toString() {
        return "Companhia " + "nome=" + this.getNome() + '}';
    }

    
    
}
