package pojo;

import interfaces.Casa;
import pojo.Casas.Propriedade;

public class Jogador {
    private Casa localizacao;
    private int saldo;
    private String nome;
    private Copo copo;
    private Tabuleiro tabuleiro;

    public Jogador(Casa localizacao, int saldo, String nome, Copo copo, Tabuleiro tabuleiro) {
        this.localizacao = localizacao;
        this.saldo = saldo;
        this.nome = nome;
        this.copo = copo;
        this.tabuleiro = tabuleiro;
    }
    
    public void movimentarJogador(){
        copo.lancarDados();
        int valorDados = copo.obterTotal();
        Casa novaCasa = tabuleiro.obterCasa(localizacao, valorDados);                             
        localizacao = novaCasa;        
    }
    
    public void opcaoJogador(){
        if(localizacao instanceof Propriedade){
            
        } else {
            localizacao.acao(this);
        }
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
    
    
}
