import java.util.Scanner;

public class ListaUmExercicioCinco {

    public static void main(String[] args) {
        double salarioBruto, numeroHoras, valorHora, salarioFami, numeroDeFi, ganhoDeHoras;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo Calculo Salario Bruto");

        System.out.println("\nInforme o número de horas trabalhadas no mês: ");
        numeroHoras = scanner.nextDouble();

        System.out.println("\nInforme o valor recebiso por hora de trabalho: ");
        valorHora = scanner.nextDouble();

        System.out.println("\nInforme o número de filhos com idade menor que 14 anos, para calcular o salário família: ");
        numeroDeFi = scanner.nextDouble();

        salarioFami = numeroDeFi * 59.82;

        ganhoDeHoras = numeroHoras * valorHora;

        salarioBruto = ganhoDeHoras + salarioFami;

        System.out.println("\nO funcionario receberá um salario bruto de: R$" + salarioBruto);
        scanner.close();
    }
}