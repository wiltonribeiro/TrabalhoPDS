package Fabricas;

import pojo.Carta;
import pojo.CartasAcao.Paga;//
import pojo.CartasAcao.Aposta;
import pojo.CartasAcao.Recebe;//
import pojo.CartasAcao.SairPrisao;//
import pojo.CartasAcao.VaInicio;
import pojo.CartasAcao.VaPrisao;

public class FabricaCarta {
	
	public Carta criarCarta(String descricao, String tipo, int valor) {
		Carta carta = null;
		if(tipo.equals("Paga")) {
			carta = new Carta(descricao, new Paga(valor));
		}else if(tipo.equals("Recebe")) {
			carta = new Carta(descricao, new Recebe(valor));
		}
		return carta;
	}
	
	public Carta criarCarta(String descricao, String tipo) {
		Carta carta = null;
		if(tipo.equals("Aposta")) {
			carta = new Carta(descricao, new Aposta());
		}else if(tipo.equals("SairPrisao")) {
			carta = new Carta(descricao, new SairPrisao());
		}else if(tipo.equals("VaInicio")) {
			carta = new Carta(descricao, new VaInicio());
		}else if(tipo.equals("VaPrisao")) {
			carta = new Carta(descricao, new VaPrisao());
		}
		return carta;
	}
	
}
