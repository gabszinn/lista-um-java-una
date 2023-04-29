import java.util.Scanner;

public class ListaUmExercicioNove {

public static void main(String[] args) {
double numeroDeSeg, numeroDeMin, numeroDeHoras;

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Algoritimo Calculo Número de Segundos");
    System.out.println("\nInforme um número inteiro de segundos: ");
    numeroDeSeg = scanner.nextDouble();

    numeroDeMin = numeroDeSeg / 60;
    numeroDeHoras = numeroDeMin / 60;

    System.out.println("\nO número de segundos é: " + numeroDeSeg);
    System.out.println("\nO número de minutos é: " + numeroDeMin);
    System.out.println("\nO número de horas é: " + numeroDeHoras);
    scanner.close();
}
}