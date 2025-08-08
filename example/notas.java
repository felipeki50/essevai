import java.util.Scanner;

class notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("\nAluno: " + nome);
        System.out.println("Média: " + String.format("%.2f", media));

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado ");
        } else {
            System.out.println("Situação: Reprovado ");
        }

        scanner.close();
    }
}
