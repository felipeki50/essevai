package org.example;

public class Loja {
    public static void main(String[] args) {
        String nomeProduto = "Óculos de Sol";
        double preco = 500.0;
        int parcelas = 5;

        double valorParcela = preco / parcelas;

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço total: R$ " + String.format("%.2f", preco));
        System.out.println("Parcelado em " + parcelas + "x de R$ " + String.format("%.2f", valorParcela));
    }
}

