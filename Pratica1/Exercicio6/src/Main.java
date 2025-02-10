/*Escreva um programa em Java que leia 5 números reais e encontre e mostre na
tela o menor deles. Depois, some este valor a todos os números e mostre na tela
estes números na mesma linha, separados por vírgula, com exatamente duas casas
decimais*/

import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float[] num = new float[5]; //criando e alocando espaço do vetor
        float menor=0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o numero " + (i+1) + ": ");
            num[i] = sc.nextFloat();

            if(i==0){
                menor = num[i];
            }
            else if(menor>num[i]){
                menor = num[i];
            }
        }
        System.out.println("Menor valor: " + menor);

        //somando o menor valor aos outros

        for (int i = 0; i < 5; i++) {
            num[i] += menor;
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%.2f ", num[i]);
        }


        sc.close();
    }
}