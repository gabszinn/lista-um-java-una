import java.util.Scanner;

public class ListaUmExercicioUm {

    public static void main(String[] args) {
        double numeroUm, numeroDois, media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo Calculo Média Aritimetica");

        System.out.println("\nInforme  primeiro número: ");
        numeroUm = scanner.nextDouble();

        System.out.println("\nInforme o segundo número: ");
        numeroDois = scanner.nextDouble();

        media = (numeroDois + numeroUm) / 2;

        System.out.println("\nA média aritimética entre os números " + numeroUm + " e " + numeroDois + " é: " + media);
        scanner.close();
    }
}