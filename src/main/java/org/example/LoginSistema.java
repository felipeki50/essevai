package org.example;

import java.util.Scanner;

public class LoginSistema {
    public static void main(String[] args) {
        String loginCorreto = "admin";
        String senhaCorreta = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String login = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Bem vindo, usuário logado.");
        } else {
            System.out.println("Nome de usuário ou senha inválidos.");
        }

        scanner.close();
    }
}
