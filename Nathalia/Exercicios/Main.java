package Exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //PRODUTO
        Produto produto1 = new Produto();
        produto1.nome = "Shampoo";
        produto1.preco = 25.90;
        Produto produto2 = new Produto();
        produto2.nome = "Sabonete";
        produto2.preco = 13.50;
        Produto produto3 = new Produto();
        produto3.nome = "Escova de dente";
        produto3.preco = 16.99;

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        //ArrayList<>: usado para desenvolver uma lista.
        //.add(): adiciona os atributos na lista
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        System.out.println("|| Produtos ||");
        System.out.println("Total de produtos: " + listaDeProdutos.size());
        System.out.println(listaDeProdutos);

        System.out.println("-----------");

        //imprimir o produto mais caro
        System.out.println("|| Produto mais caro ||");
        for (Produto produto : listaDeProdutos){
            //Produto produto: traz os atributos da classe para o for
            if (produto.preco > 20){
                System.out.println("Produto: " + produto.nome);
            }
        }

        System.out.println("-------------------------------");

        //LIVROS
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.anoPublicacao = 1899;
        Livro livro2 = new Livro();
        livro2.titulo = "O Código Da Vinci";
        livro2.autor = "Dan Brown";
        livro2.anoPublicacao = 2003;
        Livro livro3 = new Livro();
        livro3.titulo = "A Garota do Trem";
        livro3.autor = "Paula Hawkins";
        livro3.anoPublicacao = 2015;

        ArrayList<Livro> listaDeLivros = new ArrayList<>();
        listaDeLivros.add(livro1);
        listaDeLivros.add(livro2);
        listaDeLivros.add(livro3);
        System.out.println("|| Livros ||");
        System.out.println("Total de Livros: " + listaDeLivros.size());
        System.out.println(listaDeLivros);

        System.out.println("-----------");

        //filtrar os publicados depois de 2010
        System.out.println("|| Livros após 2010 ||");
        for (Livro livro : listaDeLivros) {
            if (livro.anoPublicacao > 2010){
                System.out.println("Livro: " + livro.titulo);
            }
        }

        System.out.println("-------------------------------");

        //ALUNOS
        Aluno aluno1 = new Aluno("Luiz", 4);
        Aluno aluno2 = new Aluno("Kairo", 2);
        Aluno aluno3 = new Aluno("Jane", 10);
        Aluno aluno4 = new Aluno("Sabrina", 8);
        Aluno aluno5 = new Aluno("Sandro", 10);

        ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
        listaDeAlunos.add(aluno1);
        listaDeAlunos.add(aluno2);
        listaDeAlunos.add(aluno3);
        listaDeAlunos.add(aluno4);
        listaDeAlunos.add(aluno5);
        System.out.println("|| Alunos ||");
        System.out.println("Total de alunos: " + listaDeAlunos.size());
        System.out.println(listaDeAlunos);

        System.out.println("-----------");

        //calcular a média das notas e imprimir os aprovados (nota > 7) = andamento
        System.out.println("|| Alunos aprovados ||");
        int soma = 0;
        for (Aluno aluno : listaDeAlunos) {
            soma += aluno.nota;
        }
        for (Aluno aluno : listaDeAlunos) {
            if (aluno.nota > 7){
                System.out.println(aluno.nome + " com nota " + aluno.nota);
            }
        }

        double media = (double) soma / listaDeAlunos.size();

        System.out.println("-------------------------------");

        //CARROS
        Carro carro1 = new Carro("Volkswagen", 1938, "Branco");
        Carro carro2 = new Carro("Nissan", 1990, "Vermelho");
        Carro carro3 = new Carro("BMW", 1929, "Preto");
        Carro carro4 = new Carro("Picape", 1998, "Vermelho");

        ArrayList<Carro> listaDeCarros = new ArrayList<>();
        listaDeCarros.add(carro1);
        listaDeCarros.add(carro2);
        listaDeCarros.add(carro3);
        listaDeCarros.add(carro4);
        System.out.println("|| Carros ||");
        System.out.println("Total de carros: " + listaDeCarros.size());
        System.out.println(listaDeCarros);

        System.out.println("-----------");

        //imprimir os carros que são vermelhos
        System.out.println("|| Carros vermelhos ||");
        for (Carro carro : listaDeCarros){
            if (carro.cor == "Vermelho"){
                System.out.println(carro.modelo);
            }
        }

        System.out.println("-------------------------------");

        //ANIMAIS
        Animal animal1 = new Animal("Bob", "Gato");
        Animal animal2 = new Animal("Larry", "Cobra");
        Animal animal3 = new Animal("Ester", "Cachorro");
        Animal animal4 = new Animal("Juju", "Gato");
        Animal animal5 = new Animal("Marie", "Gato");

        ArrayList<Animal> listaDeAnimais = new ArrayList<>();
        listaDeAnimais.add(animal1);
        listaDeAnimais.add(animal2);
        listaDeAnimais.add(animal3);
        listaDeAnimais.add(animal4);
        listaDeAnimais.add(animal5);
        System.out.println("|| Animais ||");
        System.out.println("Total de animais: " + listaDeAnimais.size());
        System.out.println(listaDeAnimais);

        System.out.println("-----------");

        System.out.println("|| Gatos da lista dos animais ||");
        for (Animal animal : listaDeAnimais){
            if (animal.especie == "Gato"){
                System.out.println(animal.nome);
            }
        }

        System.out.println("-------------------------------");

        //VIAGEM
        Viagem viagem1 = new Viagem("Itália", 15);
        Viagem viagem2 = new Viagem("China", 2);
        Viagem viagem3 = new Viagem("Austrália", 3);
        Viagem viagem4 = new Viagem("Chile", 3);
        Viagem viagem5 = new Viagem("Madagascar", 2);

        ArrayList<Viagem> listaDeViagens = new ArrayList<>();
        listaDeViagens.add(viagem1);
        listaDeViagens.add(viagem2);
        listaDeViagens.add(viagem3);
        listaDeViagens.add(viagem4);
        listaDeViagens.add(viagem5);
        System.out.println("|| Viagens ||");
        System.out.println("Total de viagens: " + listaDeViagens.size());
        System.out.println(listaDeViagens);

        System.out.println("-----------");

        System.out.println("|| Viagens que duram mais de 7 dias ||");
        for (Viagem viagem : listaDeViagens){
            if (viagem.duracaoDias > 7){
                System.out.println("Viagem: " + viagem.destino);
            }
        }

        System.out.println("-------------------------------");

        //RECEITAS
        Receita receita1 = new Receita("Bolo", 20);
        Receita receita2 = new Receita("Pizza", 60);
        Receita receita3 = new Receita("Strogonoff", 30);
        Receita receita4 = new Receita("Brigadeiro", 10);

        ArrayList<Receita> listaDeReceitas = new ArrayList<>();
        listaDeReceitas.add(receita1);
        listaDeReceitas.add(receita2);
        listaDeReceitas.add(receita3);
        listaDeReceitas.add(receita4);
        System.out.println("|| Receitas ||");
        System.out.println("Total de receitas: " + listaDeReceitas.size());
        System.out.println(listaDeReceitas);

        System.out.println("-----------");

        System.out.println("|| Receitas que levam menos de 30 minutos ||");
        for (Receita receita : listaDeReceitas){
            if (receita.tempoPreparo < 30){
                System.out.println(receita.nome);
            }
        }

        System.out.println("-------------------------------");

        //FILMES
        Filme filme1 = new Filme("Soul", "Drama", 9.9);
        Filme filme2 = new Filme("A Hora do Pesadelo", "Terror", 8.4);
        Filme filme3 = new Filme("Vingadores", "Ação", 5.5);
        Filme filme4 = new Filme("Todo Mundo em Pânico", "Comédia", 3.4);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(filme4);
        System.out.println("|| Filmes ||");
        System.out.println("Total de filmes: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);

        System.out.println("-----------");

        System.out.println("|| Filmes com avaliação acima de 8.0 ||");
        for (Filme filme : listaDeFilmes){
            if (filme.avaliacao > 8){
                System.out.println(filme.titulo);
            }
        }

        System.out.println("-------------------------------");

        //ATLETAS
        Atleta atleta1 = new Atleta("Roger", "Salto", 3.0);
        Atleta atleta2 = new Atleta("Amanda", "Arremesso", 10.0);
        Atleta atleta3 = new Atleta("Paulo", "Corrida de pista", 5.0);

        ArrayList<Atleta> listaDeAtletas = new ArrayList<>();
        listaDeAtletas.add(atleta1);
        listaDeAtletas.add(atleta2);
        listaDeAtletas.add(atleta3);
        System.out.println("|| Atletas ||");
        System.out.println("Total de atletas: " + listaDeAtletas.size());
        System.out.println(listaDeAtletas);

        System.out.println("-----------");

        System.out.println("|| Campeão com maior pontuação ||");
        for (Atleta atleta : listaDeAtletas){
            if (atleta.pontuacao > 9){
                System.out.println(atleta.nome);
            }
        }

        }
    }