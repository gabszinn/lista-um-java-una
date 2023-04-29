import java.util.Scanner;
import java.lang.Math;

public class ListaUmExercicioDez {
    
    public static void main(String[] args) {
        double num1, num2, num3, ari, har, geo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo Calculo Média Aritimética, Harmônica e Geométrica");

        System.out.println("\nInforme  o primeiro valor: ");
        num1 = scanner.nextDouble();

        System.out.println("\nInforme  o segundo valor: ");
        num2 = scanner.nextDouble();

        System.out.println("\nInforme  o terceiro valor: ");
        num3 = scanner.nextDouble();

        ari = (num1 + num2 + num3) / 3;
        har = (3 / (1/num1) + (1/num2) + (1/num3));
        geo = Math.sqrt(num1 * num2 * num3);

        System.out.println("\nA média aritimética é: " + ari);
        System.out.println("A média harmônica é: " + har);
        System.out.println("A média geométrica é: " + geo);
        scanner.close();
    }
}
