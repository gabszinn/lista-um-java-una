import java.util.Scanner;
public class ExercicioQuatroListaDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor1, valor2, resultado;
        System.out.println("Digite um número de 1 a 3!");
        valor1 = input.nextDouble();
        System.out.println("Digite o valor do raio: ");
        valor2 = input.nextDouble();
        resultado = 0;
        if(valor1 == 1){
            resultado = 2 * Math.PI * valor2;
            System.out.printf("O perímetro é: %.2f", resultado);
        } else if(valor1 == 2){
            resultado = Math.PI * Math.pow(valor2, 2);
            System.out.printf("A área do círculo é: %.2f", resultado);
        } else if (valor1 == 3){
            resultado = (4 / 3) * Math.PI * Math.pow(valor2, 3);
            System.out.printf("O volume da esfera é: %.2f", resultado);
        }else{
            System.out.println("O código da operação é inválido!");
        }
        input.close();
    }   
}        