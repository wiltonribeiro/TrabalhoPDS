package pojo;

import java.util.ArrayList;
import java.util.List;
import pojo.Cartas.Aposta;
import pojo.Cartas.Paga;
import pojo.Cartas.Recebe;
import pojo.Cartas.SairPrisao;
import pojo.Cartas.VaInicio;
import pojo.Cartas.VaPrisao;

public class InicializadorCartas {    
    public static InicializadorCartas inicializadorCarta;
    private List<Carta> cartas;
    
    public static InicializadorCartas getInstance(){
        if(inicializadorCarta==null){
            inicializadorCarta = new InicializadorCartas();
        }
        
        return inicializadorCarta;
    }
    
    private InicializadorCartas(){
        cartas = new ArrayList<>();
        inicializarCartas();
    }
    
    private void inicializarCartas(){
        cartas.add(new Carta("A prefeitura mandou abrir uma nova avenida para o que desapropriou vários prédios. Em consequência seu terreno valorizou.", new Recebe(25)));
        cartas.add(new Carta("Papai os livros do ano passado não servem mais preciso de livros novos.", new Paga(40)));
        cartas.add(new Carta("Seus filhos vão para a escola, pague a primeira mensalidade", new Paga(50)));
        cartas.add(new Carta("Houve um assalto a sua loja, mas você estava segurado", new Recebe(150)));
        cartas.add(new Carta("Seu clube está ampliando as piscinas, os sócios devem contribuir.", new Paga(25)));
        cartas.add(new Carta("Você acaba de receber a comunicação do imposto de renda.", new Paga(50)));
        cartas.add(new Carta("Você foi promovido a diretor da sua empresa.", new Recebe(100)));
        cartas.add(new Carta("Você é papai outra vez, despesas da maternidade.", new Paga(100)));
        cartas.add(new Carta("Parabéns ! Você convidou os seus amigos para festejar o seu aniversário.", new Paga(100)));
        cartas.add(new Carta("Um amigo tinha lhe pedido um empréstimo e se esqueceu de devolver. Ele acaba de se lembrar.", new Recebe(80)));
        cartas.add(new Carta("Você saiu de férias e se hospedou na casa de um amigo. Economizou o hotel.", new Recebe(45)));
        cartas.add(new Carta("Você vai casar e está comprando um apartamento novo.", new Paga(25)));
        cartas.add(new Carta("Você estacionou seu carro em um local proibido e entrou na contra mão.", new Paga(30)));
        cartas.add(new Carta("O médico lhe recomendou repouso em um bom hotel de montanha.", new Paga(45)));
        cartas.add(new Carta("A geada prejudicou boa parte da sua safra de café.", new Paga(50)));
        //
        cartas.add(new Carta("Você trocou seu carro usado com amigo e ainda saiu lucrando", new Recebe(50)));
        cartas.add(new Carta("O seu cachorro policial ganhou o prêmio da Kennel Clube", new Recebe(100)));
        cartas.add(new Carta("Seus parentes do interior vieram passar umas férias na sua casa", new Paga(45)));
        cartas.add(new Carta("Você jogou na loteria esportiva com conjunto de amigos e ganharam !", new Recebe(20)));
        //
        cartas.add(new Carta("Um amigo pediu lhe um empréstimo, não há como recusar", new Paga(15)));
        cartas.add(new Carta("Inesperadamente você recebeu uma herança que já estava esquecida", new Recebe(100)));
        cartas.add(new Carta("Você achou interessante assistir a novo temporada de ballet. Compre os ingressos.", new Paga(30)));
        //
        cartas.add(new Carta("Saida livre da prisao", new SairPrisao()));
        cartas.add(new Carta("Você está com sorte, suas ações na Bolsa de Valores estão em alta.", new Recebe(200)));
        cartas.add(new Carta("Renove a tempo a licença do seu automóvel.", new Paga(30)));
        cartas.add(new Carta("Você acaba de receber uma parcela do seu 13º salário.", new Recebe(50)));
        cartas.add(new Carta("Você tiru o primeiro lugar do tornei de tênis do seu clube. Parabéns !", new Recebe(100)));
        cartas.add(new Carta("Você apostou com seus parceiros deste jogo e ganhou, receba 50 de cada um.", new Aposta()));        
        cartas.add(new Carta("Avance até o ponto de partida e ...", new VaInicio()));
        cartas.add(new Carta("Vá para a prisão sem receber nada, talvez eu lhe faça uma visita", new VaPrisao()));
    }
    
    public List<Carta> getCartas(){
        return cartas;
    }
}
