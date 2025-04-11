package org.example;

public class camisetaEstampada extends camisetaSimples {
    private String estampa;

    public camisetaEstampada(String cor, String tamanho, double preco, String estampa) {
        super(cor, tamanho, preco);
        this.estampa = estampa;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Estampa: " + estampa);
    }

    @Override
    public double calcularDesconto() {

        return getPreco() * 0.95;
    }
}

// Será aplicado desconto de 5% para camisetas estampadas