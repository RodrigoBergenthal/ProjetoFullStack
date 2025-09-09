# ProjetoFullStack
https://github.com/alura-cursos/2914-java-screenmatch-listas-colecoes
#
05
Para saber mais: arrays no Java
 Próxima Atividade

Em Java, arrays são estruturas de dados que permitem armazenar uma coleção de elementos do mesmo tipo. Eles são muito utilizados para manipulação de dados em projetos de programação.

Para declarar um array em Java, é preciso definir seu tipo e tamanho. Por exemplo, para criar um array de inteiros com tamanho 5, podemos escrever o seguinte código:

int[] numeros = new int[5];Copiar código
Aqui, estamos declarando um array chamado "numeros" do tipo "int" e com tamanho 5. É importante lembrar que o índice dos elementos de um array começa em 0 e vai até o tamanho do array menos 1.

Após declarar um array, podemos inicializá-lo com valores. Por exemplo, podemos preencher o array "numeros" com os números de 1 a 5 da seguinte forma:

for (int i = 0; i < numeros.length; i++) {
    numeros[i] = i + 1;
}Copiar código
Aqui, estamos percorrendo o array "numeros" utilizando um loop for e preenchendo cada posição com seu respectivo índice mais 1.

Também é possível criar arrays de objetos e não apenas de tipos primitivos. Por exemplo:

Filme[] filmes = new Filme[2];

Filme filme1 = new Filme("Avatar", 2009);
Filme filme2 = new Filme("Dogville", 2003);

filmes[0] = filme1;
filmes[1] = filme2;Copiar código
Embora os arrays sejam úteis, eles possuem algumas limitações que podem causar problemas em projetos. Alguns desses problemas incluem:

Tamanho fixo: o tamanho de um array é fixo e não pode ser alterado após a sua criação. Isso pode ser problemático em situações em que o tamanho dos dados a serem armazenados é desconhecido ou variável.

Ausência de métodos: arrays não possuem métodos que permitam a inserção, remoção ou pesquisa de elementos de forma eficiente. Isso pode levar a soluções de código complicadas e ineficientes para tarefas simples.

Justamente por conta desses problemas e dificuldades é que não devemos utilizar arrays para representar uma coleção de elementos, mas sim alguma classe do Java, como a ArrayList, que encapsula e abstrai um array, facilitando a sua utilização via métodos e deixando o código do projeto mais simples de entender e evoluir.

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html
