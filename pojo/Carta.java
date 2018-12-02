package pojo;

import pojo.Cartas.AcaoCarta;

public class Carta {      
    private String descricao;
    private AcaoCarta acaoCarta;

    public Carta(String descricao, AcaoCarta acaoCarta) {
        this.descricao = descricao;
        this.acaoCarta = acaoCarta;
    }    
    
    public String getDescricao() {
        return descricao;
    }
    
    public void acao(Jogador jogador){
        acaoCarta.acaoCarta(this, jogador);
    }
        
}
