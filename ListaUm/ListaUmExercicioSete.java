import java.util.Scanner;

public class ListaUmExercicioSete {

    public static void main(String[] args) {
        double salarioFix, valorVendas, percentualGanho, salarioTotal, ganhoVenda;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo Calculo Salario Total");

        System.out.println("\nInforme o salario Fixo: ");
        salarioFix = scanner.nextDouble();

        System.out.println("\nInforme o valor total das vendas: ");
        valorVendas = scanner.nextDouble();

        System.out.println("\nInforme o percentual de seu ganho: ");
        percentualGanho = scanner.nextDouble() / 100;

        ganhoVenda = valorVendas * percentualGanho;

        salarioTotal = salarioFix + ganhoVenda;

        System.out.println("\nO salario total é: " + salarioTotal);
        scanner.close();
    }
    
}