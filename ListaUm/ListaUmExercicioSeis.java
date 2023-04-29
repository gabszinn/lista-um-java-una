import java.util.Scanner;

public class ListaUmExercicioSeis {

    public static void main(String[] args) {
        double num1, num2, logaritimo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo Calculo Logaritimo");

        System.out.println("\nInforme o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.println("\nInforme o segundo número: ");
        num2 = scanner.nextDouble();

        logaritimo = Math.log(num1) / Math.log(num2);

        System.out.println("\nO logaritimo do número " + num1 + " é: " + logaritimo);
        scanner.close();
    }
}