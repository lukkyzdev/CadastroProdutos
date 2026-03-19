package br.edu.produto;

public class Principal {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500.00);

        Produto p2 = new Produto("Tablet", 2300.00);

        Produto p3 = new Produto();
        p3.nome = "Videogame";
        p3.preço = 5750.00;

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();

        System.out.println("----------------------");
        
        Produto.exibirQuantidadeTotal();
    }
    
}
