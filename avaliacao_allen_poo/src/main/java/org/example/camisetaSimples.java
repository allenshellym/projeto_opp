package org.example;

public class camisetaSimples {
    private String cor;
    private String tamanho;
    private double preco;

    public camisetaSimples(String cor, String tamanho, double preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço sem desconto: R$" + preco);
    }

    public double calcularDesconto() {
        return preco * 0.90;
    }

    public double getPreco() {
        return preco;
    }
}

// Será aplicado desconto de 10% para camisetas simples
