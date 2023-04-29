import java.util.Scanner;

public class ListaUmExercicioDois {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double precoDoProduto, porcentagem, precoFinal;

        System.out.println("Algoritimo Calculo Porcentagem");

        System.out.println("\nInforme o preço do produto: ");
        precoDoProduto = scanner.nextDouble();

        porcentagem = precoDoProduto * 0.1;
        
        precoFinal = precoDoProduto + porcentagem;

        System.out.println("\nO novo valor do produto é: " + precoFinal);
        scanner.close();
    }
}