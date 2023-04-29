import java.util.Scanner;

public class ListaUmExercicioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numeroDeVeiculos, numeroDeRodas, totalDeCarros, totalDeMotos, rodasPorCarro, rodasPorMoto;

        System.out.println("\nInforme a quantidade de veículos:");
        numeroDeVeiculos = scanner.nextDouble();

        System.out.println("\nInforme a quantidade de rodas:");
        numeroDeRodas = scanner.nextDouble();

        rodasPorCarro = 4;
        rodasPorMoto = 2;

        totalDeCarros = (numeroDeRodas - (rodasPorMoto * numeroDeVeiculos)) / (rodasPorCarro - rodasPorMoto);

        totalDeMotos = numeroDeVeiculos - totalDeCarros;

        System.out.println("A quantidade de carros é de: " + totalDeCarros + " e a quantidade de motos é de: " + totalDeMotos);
    }
}