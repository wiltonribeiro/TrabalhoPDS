package inicializador;

import java.util.ArrayList;
import java.util.List;

import Fabricas.FabricaCarta;
import pojo.Carta;
import pojo.CartasAcao.Aposta;
import pojo.CartasAcao.Paga;
import pojo.CartasAcao.Recebe;
import pojo.CartasAcao.SairPrisao;
import pojo.CartasAcao.VaInicio;
import pojo.CartasAcao.VaPrisao;

public class InicializadorCartas {    
    public static InicializadorCartas inicializadorCarta;
    private List<Carta> cartas;
    private FabricaCarta fabricaCarta;
    
    public static InicializadorCartas getInstance(){
        if(inicializadorCarta==null){
            inicializadorCarta = new InicializadorCartas();
        }
        
        return inicializadorCarta;
    }
    
    private InicializadorCartas(){
        cartas = new ArrayList<>();
        fabricaCarta = new FabricaCarta();
        inicializarCartas();
    }
    
    private void inicializarCartas(){
            cartas.add( fabricaCarta.criarCarta("A prefeitura mandou abrir uma nova avenida para o que desapropriou vários prédios. Em consequência seu terreno valorizou.", "Recebe", 25));
            cartas.add( fabricaCarta.criarCarta("Papai os livros do ano passado não servem mais preciso de livros novos.", "Paga", 40));
            cartas.add( fabricaCarta.criarCarta("Seus filhos vão para a escola, pague a primeira mensalidade", "Paga", 50));
            cartas.add( fabricaCarta.criarCarta("Houve um assalto a sua loja, mas você estava segurado", "Recebe", 150));
            cartas.add( fabricaCarta.criarCarta("Seu clube está ampliando as piscinas, os sócios devem contribuir.", "Paga", 25));
            cartas.add( fabricaCarta.criarCarta("Você acaba de receber a comunicação do imposto de renda.", "Paga", 50));
            cartas.add( fabricaCarta.criarCarta("Você foi promovido a diretor da sua empresa.", "Recebe", 100));
            cartas.add( fabricaCarta.criarCarta("Você é papai outra vez, despesas da maternidade.", "Paga", 100));
            cartas.add( fabricaCarta.criarCarta("Parabéns ! Você convidou os seus amigos para festejar o seu aniversário.", "Paga", 100));
            cartas.add( fabricaCarta.criarCarta("Um amigo tinha lhe pedido um empréstimo e se esqueceu de devolver. Ele acaba de se lembrar.", "Recebe", 80));
            cartas.add( fabricaCarta.criarCarta("Você saiu de férias e se hospedou na casa de um amigo. Economizou o hotel.", "Recebe", 45));
            cartas.add( fabricaCarta.criarCarta("Você vai casar e está comprando um apartamento novo.", "Paga", 25));
            cartas.add( fabricaCarta.criarCarta("Você estacionou seu carro em um local proibido e entrou na contra mão.", "Paga", 30));
            cartas.add( fabricaCarta.criarCarta("O médico lhe recomendou repouso em um bom hotel de montanha.", "Paga", 45));
            cartas.add( fabricaCarta.criarCarta("A geada prejudicou boa parte da sua safra de café.", "Paga", 50));
            cartas.add( fabricaCarta.criarCarta("Você trocou seu carro usado com amigo e ainda saiu lucrando", "Recebe", 50));
            cartas.add( fabricaCarta.criarCarta("O seu cachorro policial ganhou o prêmio da Kennel Clube", "Recebe", 100));
            cartas.add( fabricaCarta.criarCarta("Seus parentes do interior vieram passar umas férias na sua casa", "Paga", 45));
            cartas.add( fabricaCarta.criarCarta("Você jogou na loteria esportiva com conjunto de amigos e ganharam !", "Recebe", 20));
            cartas.add( fabricaCarta.criarCarta("Um amigo pediu lhe um empréstimo, não há como recusar", "Paga", 15));
            cartas.add( fabricaCarta.criarCarta("Inesperadamente você recebeu uma herança que já estava esquecida", "Recebe", 100));
            cartas.add( fabricaCarta.criarCarta("Você achou interessante assistir a novo temporada de ballet. Compre os ingressos.", "Paga", 30));
            cartas.add( fabricaCarta.criarCarta("Você está com sorte, suas ações na Bolsa de Valores estão em alta.", "Recebe", 200));
            cartas.add( fabricaCarta.criarCarta("Renove a tempo a licença do seu automóvel.", "Paga", 30));
            cartas.add( fabricaCarta.criarCarta("Você acaba de receber uma parcela do seu 13º salário.", "Recebe", 50));
            cartas.add( fabricaCarta.criarCarta("Você tirou o primeiro lugar no campenonato de vôlei. Parabéns receba 100!", "Recebe", 100));
            cartas.add( fabricaCarta.criarCarta("Você apostou com suas parceiras deste jogo e ganhou, receba 50 de cada uma.", "Aposta"));        
            cartas.add( fabricaCarta.criarCarta("Saida livre da prisao", "SairPrisao"));
            cartas.add( fabricaCarta.criarCarta("Avance até o ponto de partida e ...", "VaInicio"));
            cartas.add( fabricaCarta.criarCarta("Vá para a prisão sem receber nada, talvez eu lhe faça uma visita", "VaPrisao"));        
    }
        
    
    public List<Carta> getCartas(){
        return cartas;
    }
}
