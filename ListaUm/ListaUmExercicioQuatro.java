import java.util.Scanner;

public class ListaUmExercicioQuatro {
    public static void main(String[] args) {
        
    double jurosCompostos, valorCapital, prazoAplicação, taxaJuros, montanteReceber;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Algoritimo Calculo Juros Compostos");

    System.out.println("\nInforme o valor do capital a ser aplicado: ");
    valorCapital = scanner.nextDouble();

    System.out.println("\nInforme o prazo de aplicação em meses: ");
    prazoAplicação = scanner.nextDouble();

    System.out.println("\nInforme o valor da taxa de juros mensal: ");
    taxaJuros = scanner.nextDouble(); 

    montanteReceber = valorCapital * (1 + Math.pow(taxaJuros/100,prazoAplicação));

    jurosCompostos = montanteReceber - valorCapital;

    System.out.println("\nOs juros compostos do capital de " + valorCapital + ", com o prazo de " + prazoAplicação + " meses, uma taxa de " + taxaJuros + "% e um montante de " + montanteReceber + " é: " + jurosCompostos + "%.");
    scanner.close();
    }
}