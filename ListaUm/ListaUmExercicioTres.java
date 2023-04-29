import java.util.Scanner;

public class ListaUmExercicioTres {

    public static void main(String[] args) {
        double grausF, grausC;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo Calculo de Conversão de Temperatura");

        System.out.println("\nInforme a temperatura em Graus Fahrenheit: ");
        grausF = scanner.nextDouble();

        grausC = (grausF - 32) / 1.8;

        System.out.println("\nA temperatura em graus centígrados é: " + grausC + "°C");
        scanner.close();
    }
}