package org.example;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.setNome("Marta");
        p2.setNome("Juvenelsu");

        //p1.nome = "Marta";
        p1.cpf = "000.111.222-33";
        //p2.nome = "Juvenelsu";
        p2.cpf = "159.753.456-12";

        //System.out.println("Nome: " +  p1.nome);
        //System.out.println("CPF: " + p1.cpf);
        System.out.println("Nome: " + p1.getNome());
        //System.out.println("Nome: " +  p2.nome);
        System.out.println("Neme: " + p2.getNome());
        System.out.println("CPF: " + p2.cpf);
    }
}
