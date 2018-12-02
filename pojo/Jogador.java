package pojo;

import JGamePlay.GameImage;
import interfaces.Casa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pojo.Casas.Propriedade;

public class Jogador {
    private Casa localizacao;
    private int saldo;
    private String nome;
    private Copo copo;
    private Tabuleiro tabuleiro;
    private Peca peca;
    private ArrayList<Propriedade> propriedades;

    public Jogador(Casa localizacao, int saldo, String nome, Copo copo, Tabuleiro tabuleiro, Peca peca) {
        this.localizacao = localizacao;
        this.saldo = saldo;
        this.nome = nome;
        this.copo = copo;
        this.tabuleiro = tabuleiro;
        this.peca = peca;            
        this.propriedades = new ArrayList<>();
        peca.moverPeca(localizacao.getX(), localizacao.getY());                        
    }
    
    public void movimentarJogador(){
        
        copo.lancarDados();
        int valorDados = copo.obterTotal();        
        Casa novaCasa = tabuleiro.obterCasa(localizacao, valorDados);                             
        localizacao = novaCasa;                          
        peca.moverPeca(localizacao.getX(), localizacao.getY());              
                
        //mudar depois
        JOptionPane.showMessageDialog(null, "Ei "+this.getNome()+"! Seus dados deram "+valorDados);
        
        localizacao.acao(this);
        JOptionPane.showMessageDialog(null, "Ei "+this.getNome()+"! Seus saldo é: "+this.getSaldo()+"\n Seus imovéis são: "+this.mostrarPropriedades());
    }       
    
    public Carta tirarCarta(){
        return tabuleiro.tirarCarta();
    }

    public Casa getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Casa localizacao) {
        this.localizacao = localizacao;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Copo getCopo() {
        return copo;
    }

    public void setCopo(Copo copo) {
        this.copo = copo;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    
    public int getValorDados() {
    	return this.copo.obterTotal();
    }
    
    public void addPropriedade(Propriedade propriedade){
        propriedades.add(propriedade);
    }

    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }
    
    public boolean possuoTodasOsTerrenos(Class t){
        return tabuleiro.jogadorPossuiTodosTerrenos(this, t);
    }
    
    public String mostrarPropriedades(){
        String tudo = "";
        
        for(Propriedade p: this.getPropriedades()){
            tudo += p.toString()+"\n"; 
        }
                
        return tudo;
    }
    
}
