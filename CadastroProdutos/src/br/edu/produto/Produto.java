package br.edu.produto;

public class Produto {
    String nome;
    double preço;
    static int quantidadeTotal = 0;

    public Produto() {
        quantidadeTotal++;
    }
    
    public Produto(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;
        quantidadeTotal++;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preço);
    }

    public static void exibirQuantidadeTotal() {
        System.out.println("Quantidade total de produtos: " + quantidadeTotal);
    }
}
