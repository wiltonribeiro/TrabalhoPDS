package pojo;

import JGamePlay.GameImage;
import interfaces.Casa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pojo.Cartas.SairPrisao;
import pojo.Casas.Propriedade;

public class Jogador {
    private boolean preso;
    private Carta cartaSair;
    private Casa localizacao;
    private int saldo, rodadasPreso;
    private String nome;
    private Copo copo;    
    private Peca peca;
    private ArrayList<Propriedade> propriedades;
    private Tabuleiro tabuleiro;

    public Jogador(Casa localizacao, int saldo, String nome, Copo copo, Peca peca) {
        this.localizacao = localizacao;
        this.saldo = saldo;
        this.nome = nome;
        this.copo = copo;        
        this.peca = peca;           
        this.propriedades = new ArrayList<>();
        this.tabuleiro = Tabuleiro.getInstance();
        this.rodadasPreso = 0;
        this.preso = false;
        
        peca.acao(localizacao.getX(), localizacao.getY());                        
    }
    
    public void validarJogadasDuplas(){
                
        int qtdDuplas = 0;
        while(copo.verificaDupla()) {
                if(preso){
                    JOptionPane.showMessageDialog(null,this.nome+" tirou uma dupla de Dados: " + copo.obterTotal()/copo.quantidadeDados());
                    sairPrisao();
                    break;
                }
            
        	qtdDuplas++;
        	JOptionPane.showMessageDialog(null,this.nome+" tirou uma dupla de dados pela "+qtdDuplas+"º vez! Dados duplos: " + copo.obterTotal()/copo.quantidadeDados());
        	if(qtdDuplas == 3) {
        		JOptionPane.showMessageDialog(null, this.nome+" tirou três duplas de dados, vá para a prisão");
        		setLocalizacao(tabuleiro.obterCasaPrisao());
        		setPreso(true);                            
        		break;
        	}
        	peca.acao(localizacao.getX(), localizacao.getY()); 
        	copo.lancarDados();
        }
    }
    
    public void realizaJogada(){        
    	copo.lancarDados();        
        
        validarJogadasDuplas();      	                        

        if(preso){
           if(possuiCartaSairPrisao()){
               JOptionPane.showMessageDialog(null, this.nome+" vai sair da prisão porque sua carta te permite !");
               usarCartaSairPrisao();
           } else{
               if(rodadasPreso == 3){
                   JOptionPane.showMessageDialog(null, this.nome+" já está a três rodadas preso, pague 50 e continue jogando");
                   this.setSaldo(this.getSaldo()-50);
                   this.sairPrisao();
                   movimentarJogador(copo.obterTotal());
               } else{
                    if(copo.verificaDupla()){
                        JOptionPane.showMessageDialog(null, this.nome+" tirou uma dupla de dados ! Você saiu da prisão\n! Dados duplos: "+copo.obterTotal()/copo.quantidadeDados());
                        sairPrisao();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Nada acontece, continue na prisão");
                        rodadasPreso++;                   
                    } 
               }               
           }
        } else movimentarJogador(copo.obterTotal());                                                   
    }       
    
    
    public void movimentarJogador(int valorDados){    
        Casa novaCasa = tabuleiro.obterCasa(localizacao, valorDados);                                             
        if(tabuleiro.obterPosicaoCasa(novaCasa) < tabuleiro.obterPosicaoCasa(localizacao))
            bonusDaRodada();
        
        localizacao = novaCasa;                          
        peca.acao(localizacao.getX(), localizacao.getY());              
                
        
        JOptionPane.showMessageDialog(null, "Ei "+this.getNome()+"! Seus dados deram "+valorDados);        
        localizacao.acao(this);
        JOptionPane.showMessageDialog(null, "Ei "+this.getNome()+"! Seus saldo é: "+this.getSaldo()+"\nSeus imovéis são:\n"+this.mostrarPropriedades());
    }
    
    public void bonusDaRodada(){        
        this.saldo += 200;
    }
    
    public Carta tirarCarta(){
        return tabuleiro.tirarCarta();
    }
    
    public void devolverCarta(Carta carta){
        tabuleiro.devolverCarta(carta);
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
    
    public boolean possuiCartaSairPrisao(){
        return cartaSair != null;
    }
    
    public void usarCartaSairPrisao(){        
        sairPrisao();
        this.devolverCarta(cartaSair);
    }
    
    public void guardarCartaSairPrisao(Carta carta){
        cartaSair = carta;
    }
    
    public void setPreso(boolean preso){
        this.preso = preso;
    }
    
    public void sairPrisao(){
        this.setPreso(false);  
        this.rodadasPreso = 0;
    }
    
}
