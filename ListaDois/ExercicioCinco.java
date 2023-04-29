import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o símbolo da operação (+, -, *, / ou ^):");
        String operacao = scanner.next();

        double resultado;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            case "^":
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Erro: símbolo de operação inválido.");
                scanner.close();
                return;

        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
        
    }
}
