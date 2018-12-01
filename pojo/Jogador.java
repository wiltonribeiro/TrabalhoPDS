package pojo;

import JGamePlay.GameImage;
import interfaces.Casa;
import pojo.Casas.Propriedade;

public class Jogador {
    private Casa localizacao;
    private int saldo;
    private String nome;
    private Copo copo;
    private Tabuleiro tabuleiro;
    private Peca peca;

    public Jogador(Casa localizacao, int saldo, String nome, Copo copo, Tabuleiro tabuleiro, Peca peca) {
        this.localizacao = localizacao;
        this.saldo = saldo;
        this.nome = nome;
        this.copo = copo;
        this.tabuleiro = tabuleiro;
        this.peca = peca;            
        peca.moverPeca(localizacao.getX(), localizacao.getY());                        
    }
    
    public void movimentarJogador(){
        
        copo.lancarDados();
        int valorDados = copo.obterTotal();
        System.out.println("jogador lancou copos"+valorDados);
        Casa novaCasa = tabuleiro.obterCasa(localizacao, valorDados);                             
        localizacao = novaCasa;   
                        
//        //acho que é aqui
        peca.moverPeca(localizacao.getX(), localizacao.getY());              
        localizacao.acao(this);
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
    
    
}
