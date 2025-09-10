
# 📌 Projeto Full Stack

Repositório do projeto no GitHub:  
👉 [https://github.com/alura-cursos/2914-java-screenmatch-listas-colecoes](https://github.com/alura-cursos/2914-java-screenmatch-listas-colecoes)

---

## 📚 05 - Para saber mais: Arrays no Java

Em Java, **arrays** são estruturas de dados que armazenam uma coleção de elementos do mesmo tipo. Eles são muito utilizados na manipulação de dados em projetos de programação.

---

### ✅ Como declarar um array

Para criar um array de inteiros com tamanho 5:

```java
int[] numeros = new int[5];
````

* Aqui, criamos um array chamado `numeros` do tipo `int`, com tamanho **5**.
* Lembre-se: os índices começam em **0** e vão até **tamanho - 1**.

---

### 🔁 Preenchendo um array

Podemos inicializar o array com valores usando um `for`:

```java
for (int i = 0; i < numeros.length; i++) {
    numeros[i] = i + 1;
}
```

* Este laço preenche o array `numeros` com os valores de **1 a 5**.

---

### 📦 Arrays de objetos

Também é possível criar arrays de objetos, como no exemplo abaixo:

```java
Filme[] filmes = new Filme[2];

Filme filme1 = new Filme("Avatar", 2009);
Filme filme2 = new Filme("Dogville", 2003);

filmes[0] = filme1;
filmes[1] = filme2;
```

---

## ⚠️ Limitações dos Arrays

Apesar de úteis, arrays possuem algumas **limitações**:

* **Tamanho fixo**: não pode ser alterado após a criação.
* **Ausência de métodos**: como `add`, `remove` ou `contains`.

Essas limitações podem tornar o código mais complexo e menos eficiente.

---

## 💡 Solução: Use `ArrayList`

Para superar essas limitações, o Java oferece a classe [`ArrayList`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html), que encapsula um array e fornece métodos práticos para manipulação de dados.

---

## 🧪 Atividade prática (opcional)

Quer colocar em prática o que aprendeu? Tente fazer o seguinte:

### 1. Crie uma classe `Pessoa`

Com os seguintes atributos:

```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
```

---

### 2. No método `main` da classe `Principal`:

* Crie um `ArrayList` de `Pessoa` chamado `listaDePessoas`.
* Adicione pelo menos **3 pessoas** com o método `add`.
* Imprima:

  * O tamanho da lista com `size()`
  * A **primeira pessoa** com `get(0)`
  * A **lista completa** com um `for` ou `foreach`.

```java
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa("Ana", 25));
        listaDePessoas.add(new Pessoa("Carlos", 30));
        listaDePessoas.add(new Pessoa("Beatriz", 22));

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));

        System.out.println("Lista completa:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
```

