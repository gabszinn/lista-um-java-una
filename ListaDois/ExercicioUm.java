import java.util.Scanner;
public class ExercicioUmListaDois{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numeroUm, numeroDois, numeroTres, maior, menor;
        double media;
        System.out.println("Digite o primeiro numero: ");
        numeroUm = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        numeroDois = input.nextInt();

        System.out.println("Digite o terceiro numero: ");
        numeroTres = input.nextInt();

        maior = numeroUm;

        if(numeroDois > maior)
        maior = numeroDois;
        if(numeroTres > maior)
        maior = numeroTres;

        menor = numeroUm;

        if (numeroDois < menor)
        menor = numeroDois;
        if(numeroTres < menor)
        menor = numeroTres;

        media = (numeroUm + numeroDois + numeroTres) / 3.0;

        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
        System.out.printf("A media aritmetica é: %.2f", media);
        input.close();
    }
}