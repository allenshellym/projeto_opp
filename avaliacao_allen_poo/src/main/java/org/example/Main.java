package org.example;

public class Main {
    public static void main(String[] args) {
        camisetaSimples camisaSimples = new camisetaSimples("Branca", "M", 50.0);
        camisetaEstampada camisaEstampada = new camisetaEstampada ("Preta", "G", 70.0, "Floral");

        System.out.println("Detalhes da Camisa Simples:");
        camisaSimples.exibirDetalhes();
        System.out.println("Preço com desconto de 10% é de R$" + camisaSimples.calcularDesconto());

        System.out.println("Detalhes da Camisa Estampada:");
        camisaEstampada.exibirDetalhes();
        System.out.println("Preço com desconto de 5% é de R$" + camisaEstampada.calcularDesconto());
    }
}
