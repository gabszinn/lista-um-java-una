import java.util.Scanner;
public class ExercicioDoisListaDois {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int valorCompra, valorPago, troco, nota50, nota20, nota10, nota5, nota2, nota1;

        System.out.println("Digite o valor da compra: ");
        valorCompra = input.nextInt();

        System.out.println("Digite o valor pago: ");
        valorPago = input.nextInt();

        if(valorPago < valorCompra)
        System.out.println("A quantia paa é insuficiente para realizar a compra!");
        else{ 
        troco = valorPago - valorCompra;

        nota50 = troco / 50;
        troco %= 50;

        nota20 = troco / 20;
        troco %= 20;

        nota10 = troco / 10;
        troco %= 10;

        nota5 = troco / 5;
        troco %= 5;

        nota2 = troco / 2;
        troco %= 2;

        nota1 = troco;

        System.out.println("o valor do troco é: " + (valorPago - valorCompra));
        System.out.println("Notas de R$50:  " + nota50);
        System.out.println("Notas de R$20: " + nota20);
        System.out.println("Notas de R$10: " + nota10);
        System.out.println("Notas de R$5: " + nota5);
        System.out.println("Notas de R$2: " + nota2);
        System.out.println("Notas de R$1: " + nota1);
    }
    input.close();
 

    }
    
}
